package com.company;

import java.text.SimpleDateFormat;
import java.util.*;
import java.awt.*;

public class Main {

    private static void solution() {
        MyTask mytask = new MyTask();
        Timer timer = new Timer();
        timer.schedule(mytask,0, 5000);
    }

    public static void main(String[] args) {
        solution();
    }
}
