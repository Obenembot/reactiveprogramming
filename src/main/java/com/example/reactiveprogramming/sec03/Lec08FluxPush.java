package com.example.reactiveprogramming.sec03;

import com.example.reactiveprogramming.courseUtil.Util;
import com.example.reactiveprogramming.sec03.helper.NameProducer;
import reactor.core.publisher.Flux;

public class Lec08FluxPush {
    public static void main(String[] args) {
        NameProducer nameProducer = new NameProducer();

//        Works with single thread
        Flux.push(nameProducer)
                .subscribe(Util.subscriber());

        Runnable runnable = nameProducer::producer;

        for (int i = 0; i < 10; i++) {
            new Thread(runnable).start();
        }

        Util.sleepSeconds(6);
    }
}
