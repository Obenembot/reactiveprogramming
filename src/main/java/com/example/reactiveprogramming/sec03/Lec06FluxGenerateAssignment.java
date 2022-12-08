package com.example.reactiveprogramming.sec03;

import com.example.reactiveprogramming.courseUtil.Util;
import reactor.core.publisher.Flux;

public class Lec06FluxGenerateAssignment {

    public static void main(String[] args) {

        Flux.generate(synchronousSink -> {
            String country = Util.getFaker().country().name();
            System.out.println("Emitting - "+ country);
            synchronousSink.next(country);
            if (country.equalsIgnoreCase("canada"))
                synchronousSink.complete();
        }).subscribe(Util.subscriber());


    }
}
