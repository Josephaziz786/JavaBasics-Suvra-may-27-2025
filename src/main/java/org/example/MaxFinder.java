package org.example;

public class MaxFinder {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int max = findMax(a, b);
        System.out.println("Maximum is: " + max);
    }

    public static int findMax(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}

