package com.example.reactiveprogramming.sec02;

import com.example.reactiveprogramming.courseUtil.Util;
import reactor.core.publisher.Flux;

public class Lec05FluxRange {

    public static void main(String[] args) {
        Flux<Integer> range = Flux.range(2, 7);

        range.subscribe(Util.onNext());

        Flux<Integer> range1 = Flux.range(2, 7);

        range1
                .map(i -> Util.getFaker().name().fullName())
                .subscribe(Util.onNext());
    }
}
