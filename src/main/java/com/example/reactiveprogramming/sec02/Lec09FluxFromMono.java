package com.example.reactiveprogramming.sec02;

import com.example.reactiveprogramming.courseUtil.Util;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Lec09FluxFromMono {
    public static void main(String[] args) {

        Mono<String> mono = Mono.just("How are you?");

        Flux<String> flux = Flux.from(mono);

        flux.subscribe(Util.onNext());
//CONVERTING FROM FLUX TO MONO, IT TAKES THE FIRST INDEX.
        Mono<String> from = Mono.from(Flux.just("James", "How are you?", "Hi"));
        from.subscribe(Util.onNext());
    }
}
