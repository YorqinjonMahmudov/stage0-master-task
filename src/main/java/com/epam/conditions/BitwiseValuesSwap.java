package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {
        int temp = first ^ second;

        second = second ^ temp;
        first = second ^ temp;

        System.out.println(first);
        System.out.println(second);
    }

}
