package ua.hillel.katerynashpak.homework9;

import java.io.*;
import java.util.*;

public class LogReader {

    private static final String LOG_FILE_PATH = "log";

    public static void main(String[] args) throws IOException {
        File logFile = new File(LOG_FILE_PATH);
        if (!logFile.exists()) {
            logFile.createNewFile();
        }

        FileWriter writer = new FileWriter(logFile);
        writer.write("INFO: Starting JuniorCrudServiceApplication using Java 20.0.1\n");
        writer.write("DEBUG: User admin created\n");
        writer.close();

        List<String> logMessages = readLogMessages();

        System.out.println("INFO messages:");
        printLogMessages(logMessages, "INFO");
        System.out.println("DEBUG messages:");
        printLogMessages(logMessages, "DEBUG");
    }

    private static List<String> readLogMessages() throws IOException {
        List<String> logMessages = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(LOG_FILE_PATH));
        String line;
        while ((line = reader.readLine()) != null) {
            logMessages.add(line);
        }
        reader.close();
        return logMessages;
    }

    private static void printLogMessages(List<String> logMessages, String logLevel) {
        for (String logMessage : logMessages) {
            if (logMessage.startsWith(logLevel)) {
                System.out.println(logMessage);
            }
        }
    }
}
