package com.epam;

public class Main {
    public static void main(String[] args) {
        int first = 7;
        int second = 6;
        int temp = first ^ second;

        second = second ^ temp;
        System.out.println(second);

        first = second ^ temp;
        System.out.println(first);

    }
}
