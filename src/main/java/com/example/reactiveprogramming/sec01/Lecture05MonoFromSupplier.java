package com.example.reactiveprogramming.sec01;

import com.example.reactiveprogramming.courseUtil.Util;
import reactor.core.publisher.Mono;

public class Lecture05MonoFromSupplier {
    public static void main(String[] args) {
//        This should be use only when we have the data.
//        Mono<String> just = Mono.just(getName());

//        Try as much as possible using lazy loading.
//        The getNmae() only gets called when we subscribe to the Mono
        Mono<String> monoFromSupplier = Mono.fromSupplier(() -> getName());

        monoFromSupplier.subscribe(Util.onNext());

    }

    private static String getName() {
        System.out.println("Generating data...");
        return Util.getFaker().name().fullName();
    }
}
