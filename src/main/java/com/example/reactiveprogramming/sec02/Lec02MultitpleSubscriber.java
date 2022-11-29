package com.example.reactiveprogramming.sec02;

import reactor.core.publisher.Flux;

public class Lec02MultitpleSubscriber {
    public static void main(String[] args) {

        Flux<Integer> flux = Flux.just(1, 2, 3, 4, 5, 6, 7, 8);

        Flux<Integer> eventFlux = flux.filter(s -> s % 2 == 0);
        flux.subscribe(s -> System.out.println("Subscriber 1: "+s));
        System.out.println();
        eventFlux.subscribe(s -> System.out.println("eventFlux 2: "+s));

    }
}
