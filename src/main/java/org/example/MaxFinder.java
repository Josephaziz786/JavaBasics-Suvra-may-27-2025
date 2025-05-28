package org.example;

public class MaxFinder {
    public static void main(String[] args) {
        int a = 25;
        int b = 20;
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

