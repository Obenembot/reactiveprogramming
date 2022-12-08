package com.example.reactiveprogramming.sec03;

import com.example.reactiveprogramming.courseUtil.Util;
import reactor.core.publisher.Flux;

public class lec01FluxCreate {
    public static void main(String[] args) {
        Flux.create(fluxSink -> {

            String country;

            do {
                country = Util.getFaker().country().name();
                fluxSink.next(country);
            } while (!country.equalsIgnoreCase("canada"));
            fluxSink.complete();

        }).subscribe(Util.subscriber());
    }
}
