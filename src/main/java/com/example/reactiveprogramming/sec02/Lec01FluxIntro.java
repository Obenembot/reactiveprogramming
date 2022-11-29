package com.example.reactiveprogramming.sec02;

import com.example.reactiveprogramming.courseUtil.Util;
import reactor.core.publisher.Flux;

public class Lec01FluxIntro {
    public static void main(String[] args) {


        Flux<Integer> flux = Flux.just(1, 2, 3, 4, 5);

        flux.subscribe(Util.onNext(),Util.onError(),Util.onComplete());

    }
}
