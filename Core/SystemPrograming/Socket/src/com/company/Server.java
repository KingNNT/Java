package com.company;

import java.io.*;
import java.net.*;

public class Server {

    private static final int PORT = 4567;

    private static int n;
    private static int[] arr = new int[100];

    private static ServerSocket serverSocket;
    private static Socket connectionSocket;

    Server() {
        try {
            System.out.println("Binding to port " + PORT + ", please wait  ...");
            serverSocket = new ServerSocket(PORT);
            connectionSocket = serverSocket.accept();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String readFromClient() {
        try {
            BufferedReader inFromClient =
                    new BufferedReader(new
                            InputStreamReader(connectionSocket.getInputStream()));
            return inFromClient.readLine();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    private static void sendToClient(String messageFromServerToClient) {
        try {
            DataOutputStream outToClient =
                    new DataOutputStream(connectionSocket.getOutputStream());

            outToClient.writeBytes(messageFromServerToClient);
            return;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void solution() {
        new Server();

        String sentenceFromClient;
        sentenceFromClient = readFromClient();
        n = Integer.parseInt(sentenceFromClient);
        if (n < 0) {
            sendToClient("N must be a positive number");
        } else {
            sendToClient("Enter your array: ");
            for (int i = 0; i < n; i++) {
                sendToClient("arr[" + i + "]: ");
                sentenceFromClient = readFromClient();
                System.out.println(sentenceFromClient);
                arr[i] = Integer.parseInt(sentenceFromClient);
            }
            sendToClient("Your reverse array is: ");
            for (int i = 0; i < n; i++) {
                sendToClient(String.valueOf(arr[i]));
            }
        }
    }

    public static void main(String argv[]) throws Exception {
        solution();
    }
}
