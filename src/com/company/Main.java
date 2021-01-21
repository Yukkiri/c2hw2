package com.company;

public class Main {
    static int SIZE = 4;

    public static void main(String[] args) {
        String [][] firstMass = {{"333", "14", "3", "19"}, {"97", "25", "145", "18"}, {"32", "77", "98", "12"}, {"47", "55", "21", "9"}};
        String [][] SecondMass = {{"333", "14", "3", "19"}, {"97", "25", "145", "18"}, {"32", "77", "98", "12"}, {"47", "55", "21", "9"}, {"4", "97", "2", "13"}};
        String [][] thirdMass = {{"333", "14", "3", "19"}, {"97", "25f", "145", "18"}, {"32", "77", "98", "12"}, {"47", "55", "21", "9"}};
        try {
            System.out.println(sum(firstMass));
 //           System.out.println(sum(SecondMass));
            System.out.println(sum(thirdMass));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.print(e.getLine() + " " + e.getColumn() + " ");
            System.out.println(thirdMass[e.getLine()][e.getColumn()]);
        }
    }

    static int sum(String [][] mass) throws MyArrayDataException, MyArraySizeException {
        if (mass.length != SIZE) {
            throw new MyArraySizeException();
        }
        for (String[] strings : mass) {
            if (strings.length != SIZE) {
                throw new MyArraySizeException();
            }
        }

        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                try {
                    sum += Integer.parseInt(mass[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("format " + i + " " + j, i, j);
                }
            }
        }
        return sum;
    }
}
