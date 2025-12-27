package com.leetcode.coding.questions;

public class PrintEvenOddNumber {
    private int number = 1;
    private final int limit;
    private final Object lock = new Object(); // Shared lock object

    public PrintEvenOddNumber(int limit) {
        this.limit = limit;
    }

    public void printOdd() {
        synchronized (lock) {
            while (number <= limit) {
                while (number % 2 == 0) { // Wait if it's an even number's turn
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (number <= limit) { // Check limit again after waking up
                    System.out.println("Odd Thread: " + number);
                    number++;
                    lock.notify(); // Notify the even thread
                }
            }
        }
    }

    public void printEven() {
        synchronized (lock) {
            while (number <= limit) {
                while (number % 2 != 0) { // Wait if it's an odd number's turn
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (number <= limit) { // Check limit again after waking up
                    System.out.println("Even Thread: " + number);
                    number++;
                    lock.notify(); // Notify the odd thread
                }
            }
        }
    }

    public static void main(String[] args) {
        PrintEvenOddNumber printer = new PrintEvenOddNumber(20);
        Thread oddThread = new Thread(printer::printOdd, "OddThread");
        Thread evenThread = new Thread(printer::printEven, "EvenThread");

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
