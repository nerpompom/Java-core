package com.homeproject.hw_lesson_2;


import java.util.stream.Stream;

public class CountMe {

    public int arraySize(String[][] a) throws MyArraySizeException {

        int count = Stream.of(a).mapToInt(m -> m.length).sum();

        if (count == 16) {
            System.out.println("Это двумерный массив 4х4");
            return count;
        }
        throw new MyArraySizeException("Это не двумерный массив 4х4");
    }
    
    public void arraySymbol(String[][] a) throws MyArrayDataException {

        int sum = 0;
        int i;
         int j;
        int[][] numbers = new int[a.length][a.length];

         //Integer[][] numbers = Stream.of(a).mapToInt(Integer::parseInt).boxed().toArray(Integer[][]::new);

        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                numbers[j] = Integer.parseInt(a[j]);
                sum = +j;
            }
            numbers[i] = Integer.parseInt(a[i]);
            sum = +i;
         }
         System.out.println(sum);
         throw new MyArrayDataException("В ячейке " + a[i][j] + " лежит не число");
        }

        }






