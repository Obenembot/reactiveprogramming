package com.example.reactiveprogramming.sec03;

import com.example.reactiveprogramming.courseUtil.Util;
import com.example.reactiveprogramming.sec03.assignment.FileReaderService;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Lec09FileReaderServiceAssignment {
    public static void main(String[] args) {


        FileReaderService fileReaderService = new FileReaderService();
        String source = "src/main/resources/assignment.sec03/file01.txt";
        Path path = Paths.get(source);
        fileReaderService.read(path)
                .take(6)
                .subscribe(Util.subscriber());
    }
}
