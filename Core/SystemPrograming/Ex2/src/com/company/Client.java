package com.company;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
    private static final String HOST = "127.0.0.1";
    private static final int PORT = 4567;

    private static final int BOUND = 15000;
    private static final int maxRandom = 10000;
    private static Random rand = new Random();

    public static void main(String[] args) {
        String sentence_to_server;
        String sentence_from_server;

        try {
            while (true) {
                System.out.println("Randoming a integer number ...");
                int intRan = rand.nextInt(BOUND);
                System.out.println("Random Number is: " + intRan);

                BufferedReader inFromUser =
                        new BufferedReader(new InputStreamReader(System.in));
                sentence_to_server = String.valueOf(intRan);

                Socket clientSocket = new Socket(HOST, PORT);

                DataOutputStream outToServer =
                        new DataOutputStream(clientSocket.getOutputStream());

                BufferedReader inFromServer =
                        new BufferedReader(new
                                InputStreamReader(clientSocket.getInputStream()));

                if (intRan > maxRandom) {
                    outToServer.writeBytes(sentence_to_server + '\n');

                    sentence_from_server = inFromServer.readLine();
                    System.out.println("FROM SERVER: " + sentence_from_server);
                    clientSocket.close();

                    System.out.println("Close Client");
                    break;
                }
                else {
                    outToServer.writeBytes(sentence_to_server + '\n');

                    sentence_from_server = inFromServer.readLine();
                    System.out.println("FROM SERVER: " + sentence_from_server);
                    clientSocket.close();
                }
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}

