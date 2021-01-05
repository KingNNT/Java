package com.company;
import com.company.Task1;
public class Main {
    private static void solution() {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        t1.start();
        t2.start();
    }
    public static void main(String[] args) {
        solution();
    }
}
