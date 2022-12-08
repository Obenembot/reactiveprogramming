package com.example.reactiveprogramming.sec03;

import com.example.reactiveprogramming.courseUtil.Util;
import reactor.core.publisher.Flux;

public class Lec03FluxTake {

    public static void main(String[] args) {
        Flux.range(1,10)
                .log()
                .take(3)// on it gets the required number he cancels the subscription down stream.
                .log()
                .subscribe(Util.subscriber());
    }
}
