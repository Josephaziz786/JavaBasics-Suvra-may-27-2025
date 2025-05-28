package org.example;

public class EvenOddChecker {
    public static void main(String[] args) {
        int number = 30; // Try changing this number and debug
        checkEvenOdd(number);
    }

    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
