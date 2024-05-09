package com.thetechbull.junit.service;

public class CalculatorService {

    public static int addTwoNums(int a, int b) {

        return a + b;
    }

    public static int productOfTwoNums(int a, int b) {
        return a * b;
    }

    public static double dividTwoNums(int a, int b) {

        return a / b;
    }

    public static int sumAnyNum(int... numbers) {
        int s = 0;
        for (int n : numbers) {
            s = s + n;
        }
        return s;
    }
}
