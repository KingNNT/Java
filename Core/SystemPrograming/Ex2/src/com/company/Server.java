package com.company;

import java.io.*;
import java.net.*;

public class Server {
    private static final int PORT = 4567;
    private static final int maxRandom = 10000;
    private static final int initMax = Integer.MIN_VALUE;

    public static void main(String[] args) {

        String sentence_from_client;
        String sentence_to_client;

        int max = initMax;

        try {
            ServerSocket server = new ServerSocket(PORT);
            System.out.println("Server is listening at port: " + PORT);
            while (true) {
                Socket socket = server.accept();
                BufferedReader inFromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                DataOutputStream outToClient = new DataOutputStream(socket.getOutputStream());

                sentence_from_client = inFromClient.readLine();
                int numberFromClient = Integer.parseInt(sentence_from_client);
                if (numberFromClient > maxRandom) {
                    if (max == initMax) {
                        sentence_to_client = "Don't have max number" + " - " + "And Close Server" + "\n";
                    } else {
                        sentence_to_client = "Max = " + max + " - " + "And Close Server" + "\n";
                    }
                    outToClient.writeBytes(sentence_to_client);
                    System.out.println(sentence_to_client);
                    break;
                } else {
                    if (max < numberFromClient) {
                        max = numberFromClient;
                    }
                    sentence_to_client = sentence_from_client + " (Server accepted) " + " - " + "Max = " + max + "\n";
                    outToClient.writeBytes(sentence_to_client);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

