package ua.hillel.katerynashpak.homework14;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8081);
        System.out.println("Підключено до сервера!");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        out.println("hello");
        String inputLine = in.readLine();
        System.out.println("Сервер: " + inputLine);

        if ("привіт".equals(inputLine)) {
            out.println("Привіт, я тут!");
            inputLine = in.readLine();
        }
        socket.close();
    }
}

