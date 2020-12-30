package com.company;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class MyTask extends TimerTask {
    @Override
    public void run() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println("Current Date Time is: " + format.format(date));
        Random random = new Random();
        System.out.println("Random: " + random.nextInt(1));
        System.out.println("Sound beep: ");
        Toolkit.getDefaultToolkit().beep();
    }
}
