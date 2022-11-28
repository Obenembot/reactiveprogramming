package com.example.reactiveprogramming.sec01;

import com.example.reactiveprogramming.courseUtil.Util;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

public class Lecture06SupplierRefactoring {

    public static void main(String[] args) {
//       Building a Pipe Line And Executing a PineLine.
//        The pipe-line only gets executed when we subscribe to it.
//        By Default reactive programming is synchronous and can be made Asynchronous by using Schedulers.boundedElastic()
//        This is not best practice though as it sleeps the main thread.
        getName();
        getName();
        getName()
                .subscribeOn(Schedulers.boundedElastic())
                .subscribe(Util.onNext());
        getName();
        Util.sleepSeconds(4);
    }

    private static Mono<String> getName() {
        System.out.println("Entered get name method");
        return Mono.fromSupplier(() -> {
            System.out.println("Generating data...");
            Util.sleepSeconds(3);
            return Util.getFaker().name().fullName();
        }).map(String::toUpperCase);
    }
}
