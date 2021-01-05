package com.company;

import com.company.Server;
import java.util.*;

public class Main {
    private static final int delayTime = 3000;
    public static void main(String[] args) {
        Server sv = new Server();
        Timer timer = new Timer();
        System.out.println("Delay: " + delayTime + " ms");
        timer.schedule(sv, delayTime);
    }
}
