package com.example.reactiveprogramming.sec01;

import com.example.reactiveprogramming.courseUtil.Util;
import reactor.core.publisher.Mono;

public class Lecture03MonoSubscrip {

    public static void main(String[] args) {

//        publisher
        Mono<String> mono = Mono.just("Ball");

//        mono.subscribe();
//        TO EMIT DATA, WE NEED TO SUBSCRIBE.
        mono.subscribe(
                System.out::println,
                error -> System.out.println("Error: " + error.getMessage()),
                () -> System.out.println("Completed"));

//        CREATNG ERROR DIVISION BY ZERO
        Mono<Integer> mono1 = Mono.just("Ball")
                .map(item -> item.length())
                .map(item -> item / 0);

        mono1.subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete());
    }
}
