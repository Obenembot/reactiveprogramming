package com.example.reactiveprogramming.sec03;

import com.example.reactiveprogramming.courseUtil.Util;
import reactor.core.publisher.Flux;

public class Lec05FluxGenerate {
    public static void main(String[] args) {

//        The generate method is an infinite loop.
//        can be controlled by the take() method or by a conditiona state that completes or cancel the subscription
        Flux.generate(synchronousSink -> {
            synchronousSink.next("How");// we can only emit one item.
//            synchronousSink.next("How");
        }).subscribe(Util.subscriber());
    }
}
