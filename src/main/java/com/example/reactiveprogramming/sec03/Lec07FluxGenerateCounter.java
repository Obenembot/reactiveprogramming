package com.example.reactiveprogramming.sec03;

import com.example.reactiveprogramming.courseUtil.Util;
import reactor.core.publisher.Flux;

public class Lec07FluxGenerateCounter {

    public static void main(String[] args) {

        Flux.generate(() -> 1,
                (counter, sink) -> {

                    String country = Util.getFaker().country().name();
                    sink.next(country);
                    if (country.equalsIgnoreCase("canada") || counter >= 10) {
                        sink.complete();
                    }
                    return counter + 1;
                }).subscribe(Util.subscriber());
    }
}
