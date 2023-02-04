package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= cathetusLength; i++) {
            if (i == 1) {
                for (int j = 1; j < cathetusLength; j++)
                    System.out.print(" ");

                sb.append(1);
                System.out.println(sb);
            } else {
                for (int j = i; j < cathetusLength; j++)
                    System.out.print(" ");

                sb.insert(0, i);
                sb.append(i);
                System.out.println(sb);

            }
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
