package com.leetcode.coding.questions;

public class PrintingOddEvenThread {
    int n;
    int count=0;
    Object LOCK = new Object();
    PrintingOddEvenThread(int n) {
        this.n=n;
    }
    public static void main(String[] args) {
        PrintingOddEvenThread print = new PrintingOddEvenThread(20);
        Thread odd = new Thread(print::printOdd, "ODD");
        Thread even = new Thread(print::printEven, "EVEN");

        odd.start();
        even.start();

        try {
            odd.join();
            even.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    private void printOdd() {
        synchronized (LOCK) {
        while (count<=n) {
                if(count%2==0) {
                    try {
                        LOCK.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            System.out.println(count);
            count ++;
            LOCK.notify();
            }
        }
    }

    private void printEven() {
        synchronized (LOCK) {
        while (count<=n) {

            if(count%2!=0) {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(count);
            count ++;
            LOCK.notify();
            }
        }
    }

}
