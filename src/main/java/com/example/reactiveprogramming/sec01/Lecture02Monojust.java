package com.example.reactiveprogramming.sec01;

import reactor.core.publisher.Mono;

public class Lecture02Monojust {

    public static void main(String[] args) {

//        publisher
        Mono<Integer> mono = Mono.just(1);

        System.out.println(mono);
//        TO EMIT DATA, WE NEED TO SUBSCRIBE.

        mono.subscribe( i -> {
            System.out.println("Extracting data: "+ i);
        });
    }
}
