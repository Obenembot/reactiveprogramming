package com.example.reactiveprogramming.sec01;

import com.example.reactiveprogramming.courseUtil.Util;
import reactor.core.publisher.Mono;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class Lecture05MonoFromSupplier {
    public static void main(String[] args) {
//        This should be use only when we have the data.
//        Mono<String> just = Mono.just(getName());

//        Try as much as possible using lazy loading.
//        The getNmae() only gets called when we subscribe to the Mono
        Supplier<String> stringSupplier = () -> getName();
        Mono<String> monoFromSupplier = Mono.fromSupplier(stringSupplier);

        monoFromSupplier.subscribe(Util.onNext());

        Callable<String> stringCallable = () -> getName();
        Mono<String> monoFromCallable = Mono.fromCallable(stringCallable);
        monoFromCallable.subscribe(Util.onNext());

    }

    private static String getName() {
        System.out.println("Generating data...");
        return Util.getFaker().name().fullName();
    }
}
