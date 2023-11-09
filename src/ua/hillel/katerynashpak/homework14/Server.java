package ua.hillel.katerynashpak.homework14;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8081);
        System.out.println("Сервер запущений і чекає на підключення...");

        Socket socket = serverSocket.accept();
        System.out.println("Клієнт підключився!");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String inputLine = in.readLine();
        System.out.println("Клієнт: " + inputLine);

        if (inputLine != null && inputLine.contains("hello")) {
            out.println("привіт");
            inputLine = in.readLine();

        }
        socket.close();
        serverSocket.close();

    }
}

