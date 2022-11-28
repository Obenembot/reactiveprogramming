package com.example.reactiveprogramming.sec01;

import com.example.reactiveprogramming.courseUtil.Util;
import com.example.reactiveprogramming.sec01.assignment.FileService;

public class Lecture09AssignmentDemo {
    public static void main(String[] args) {

        FileService.read("file01.txt")
                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());

        FileService.write("file01.txt", "Hope you are doing well.")
                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());

        FileService.delete("file01.txt")
                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());
    }
}
