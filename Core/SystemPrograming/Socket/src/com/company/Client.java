package com.company;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    private static final String IP = "127.0.0.1";
    private static final int PORT = 4567;
    private static Socket clientSocket = null;

    private static int n;
    private static int []arr = new int[100];

    Client() {
        openConnection();
    }

    private static void openConnection() {
        try {
            clientSocket = new Socket(IP, PORT);
            System.out.println("Connected: " + clientSocket);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void closeConnection() {
        try {
            clientSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void sendToServer(String sentenceToServer) {
        try {
            DataOutputStream outToServer =
                    new DataOutputStream(clientSocket.getOutputStream());

            outToServer.writeBytes(sentenceToServer + '\n');
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String readToServer() {
        try {
            BufferedReader inFromServer =
                    new BufferedReader(new
                            InputStreamReader(clientSocket.getInputStream()));
            String sentenceFromServer = inFromServer.readLine();
            System.out.println("SERVER REPLY: " + sentenceFromServer);
            return sentenceFromServer;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    private static void solution() {
        new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        sendToServer(String.valueOf(n));
        if (readToServer().equals("Enter your array: ")) {
            for (int i = 0; i < n; i++) {
                try {
                    arr[i] = scanner.nextInt();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                sendToServer(String.valueOf(arr[i]));
            }
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                System.out.println(readToServer());
            }
        }

        closeConnection();
    }

    public static void main(String argv[]) throws Exception {
        solution();
    }
}
