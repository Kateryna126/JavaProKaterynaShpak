package ua.hillel.katerynashpak.homework11;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileNavigator navigator = new FileNavigator();

        FileData file1 = new FileData("example.txt", 500, "/path/to/file");

        navigator.add("/path/to/file", file1);

        List<FileData> files = navigator.find("/path/to/file");
        for (FileData file : files) {
            System.out.println("File name: " + file.name);
            System.out.println("File size: " + file.size);
            System.out.println("File path: " + file.path);
        }

        FileData file2 = new FileData("wrong.txt", 300, "/wrong/path");
        navigator.add("/path/to/file", file2);
    }
}

