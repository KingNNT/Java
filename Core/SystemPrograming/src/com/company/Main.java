package com.company;

import java.lang.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("/mnt/LearningAndWorking/Develop/Java/Core/SystemPrograming/output.txt");
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
