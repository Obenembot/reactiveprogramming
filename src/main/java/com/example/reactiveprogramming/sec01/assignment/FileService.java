package com.example.reactiveprogramming.sec01.assignment;

import reactor.core.publisher.Mono;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileService {
    private static Path PATH = Paths.get("src/main/resources/assignment/sec1");

    public static Mono<String> read(String filename) {
        return Mono.fromSupplier(() -> readFile(filename));
    }


    public static Mono<Void> write(String filename, String content) {
        return Mono.fromRunnable(() -> writeFile(filename, content));
    }

    public static Mono<Void> delete(String filename) {
        return Mono.fromRunnable(() -> deleteFile(filename));
    }

    private static String readFile(String fileName) {
        try {
            return Files.readString(PATH.resolve(fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeFile(String fileName, String content) {
        try {
            Files.writeString(PATH.resolve(fileName), content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void deleteFile(String fileName) {
        try {
            Files.delete(PATH.resolve(fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
