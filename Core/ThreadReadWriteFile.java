package com.company;

import java.lang.*;
import java.util.*;
import java.io.*;

public class ThreadReadWriteFile extends Thread{
    @Override
    public void run(){
        try {
            File file = new File("/mnt/LearningAndWorking/Develop/Java/Learning/Core/SystemPrograming/output.txt");
            FileWriter fileWriter = new FileWriter(file);
            Scanner scanner = new Scanner(System.in);
            String readString = scanner.nextLine();
            while(readString!=null) {
                System.out.println(readString);
                fileWriter.write(readString + "\n");

                if (readString.isEmpty()) {
                    System.out.println("Read Enter Key.");
                    break;
                }

                if (scanner.hasNextLine()) {
                    readString = scanner.nextLine();
                } else {
                    readString = null;
                }
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
