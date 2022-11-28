package com.example.reactiveprogramming.sec01;

import com.example.reactiveprogramming.courseUtil.Util;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

public class Lecture07MonoFromFuture {
    public static void main(String[] args) {
        Mono<String> fromFuture = Mono.fromFuture(() -> getName());
        fromFuture.subscribe(Util.onNext());
        Util.sleepSeconds(1);
    }

    private static CompletableFuture<String> getName() {

        return CompletableFuture.supplyAsync(() -> Util.getFaker().name().fullName());
    }
}

