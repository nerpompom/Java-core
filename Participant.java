package com.homeproject.hw_lesson_5;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Participant {
    private String[] name;
    private Integer[][] points;

    public Participant() {
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }


    public Integer[][] getPoints() {
        return points;
    }

    public void setPoints(Integer[][] points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name=" + Arrays.toString(name) +
                ", points=" + Arrays.toString(points) +
                '}';
    }

    public void save(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(String.valueOf(name));

            for (Integer[] row: points) {
                writer.write(String.valueOf(row));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private <T> String rowToString(T[] row) {
        String result = "";

        for (int i = 0; i < row.length; i++) {
            result = result + row[i].toString();
            if (i != row.length - 1) {
                result += ";";
            }
        }
        result += "\n";
        return result;
    }

    public void load(String fileName) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            name = bufferedReader.readLine().split(";");
            ArrayList<Integer[]> pointsList = new ArrayList<>();
            String tempString;
            while ((tempString = bufferedReader.readLine()) != null) {
                pointsList.add(stringToDataRow(tempString));
            }
            points = pointsList.toArray(new Integer[][]{{}});
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Integer[] stringToDataRow(String str) {
        String[] strings = str.split(";");

        Integer[] integers = new Integer[strings.length];
        for (int i = 0; i < strings.length; i++) {
            integers[i] = Integer.parseInt(strings[i]);
        }
        return integers;
    }

}
