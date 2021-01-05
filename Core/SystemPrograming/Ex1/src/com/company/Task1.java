package com.company;

import java.io.*;
import java.lang.*;
import java.util.*;

public class Task1 extends Thread{
    private void handle() {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        while (true) {
            str = scanner.nextLine();
            if (str.equals("quit")) {
                break;
            }
        }
    }

    public void run() {
        handle();
    }
}
