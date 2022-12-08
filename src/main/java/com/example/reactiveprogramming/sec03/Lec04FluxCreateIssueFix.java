package com.example.reactiveprogramming.sec03;

import com.example.reactiveprogramming.courseUtil.Util;
import reactor.core.publisher.Flux;

public class Lec04FluxCreateIssueFix {

    public static void main(String[] args) {
//        Only one instance of fluxsink
        Flux.create(fluxSink -> {

                    String country;

                    do {
                        country = Util.getFaker().country().name();
                        fluxSink.next(country);
                    } while (!country.equalsIgnoreCase("canada") && !fluxSink.isCancelled());
                    fluxSink.complete();
                })
                .take(3)
                .subscribe(Util.subscriber());
    }
}
