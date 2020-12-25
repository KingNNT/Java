package com.company;

import java.lang.*;

public class Main {
    private static void solution() {
        ThreadReadWriteFile threadFirst = new ThreadReadWriteFile();
        threadFirst.start();
    }

    public static void main(String[] args) {
        solution();
    }
}
