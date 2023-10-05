package ua.hillel.katerynashpak.homework11;

import java.util.*;

class FileNavigator {
    Map<String, List<FileData>> files;

    public FileNavigator() {
        this.files = new HashMap<>();
    }

    public void add(String path, FileData file) {
        if (!file.path.equals(path)) {
            System.out.println("Error: The file path does not match the key path.");
            return;
        }
        this.files.putIfAbsent(path, new ArrayList<>());
        this.files.get(path).add(file);
    }

    public List<FileData> find(String path) {
        return this.files.getOrDefault(path, new ArrayList<>());
    }

    public List<FileData> filterBySize(int maxSize) {
        List<FileData> result = new ArrayList<>();
        for (List<FileData> fileList : this.files.values()) {
            for (FileData file : fileList) {
                if (file.size <= maxSize) {
                    result.add(file);
                }
            }
        }
        return result;
    }

    public void remove(String path) {
        this.files.remove(path);
    }

    public List<FileData> sortBySize() {
        List<FileData> result = new ArrayList<>();
        for (List<FileData> fileList : this.files.values()) {
            result.addAll(fileList);
        }
        result.sort(Comparator.comparingInt(a -> a.size));
        return result;
    }
}

