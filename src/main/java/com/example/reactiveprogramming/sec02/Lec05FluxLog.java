package com.example.reactiveprogramming.sec02;

import com.example.reactiveprogramming.courseUtil.Util;
import reactor.core.publisher.Flux;

public class Lec05FluxLog {

    public static void main(String[] args) {
        Flux<Integer> range1 = Flux.range(1, 5);

        range1
                .log()
                .map(i -> Util.getFaker().name().fullName())
                .log()
                .subscribe(Util.onNext());
    }
}
