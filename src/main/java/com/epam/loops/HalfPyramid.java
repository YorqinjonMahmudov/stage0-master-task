package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            int temp = i;
            while (temp < cathetusLength) {
                System.out.print(" ");
                temp++;
            }

            temp = i;
            for (int j = 0; j < temp; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
