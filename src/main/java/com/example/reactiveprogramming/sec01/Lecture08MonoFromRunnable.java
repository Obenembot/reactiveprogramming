package com.example.reactiveprogramming.sec01;

import com.example.reactiveprogramming.courseUtil.Util;
import reactor.core.publisher.Mono;

public class Lecture08MonoFromRunnable {
    public static void main(String[] args) {

        Mono.fromRunnable(timeConsumingProcessor()).subscribe(Util.onNext(),
                Util.onError(),
                () -> {
                    System.out.println("Operation done sending emails...");
                });
    }

    private static Runnable timeConsumingProcessor() {
        return () -> {
//            HERE WE CAN PUT THE LOGIC THAT TAKES A LONG TIME TO PROCESS.
            Util.sleepSeconds(3);
            System.out.println("Operation Completed.");
        };
    }
}
