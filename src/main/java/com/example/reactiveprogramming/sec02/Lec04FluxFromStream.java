package com.example.reactiveprogramming.sec02;

import com.example.reactiveprogramming.courseUtil.Util;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.stream.Stream;

public class Lec04FluxFromStream {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);

        Stream<Integer> stream = integers.stream();

//        Flux<Integer> integerFlux = Flux.fromStream(stream);
        //using the supplier function
        Flux<Integer> integerFlux = Flux.fromStream(() -> integers.stream());

        integerFlux.subscribe(Util.onNext(),Util.onError(), Util.onComplete());
//        Can't iterate on a stream twice.
        integerFlux.subscribe(Util.onNext(),Util.onError(), Util.onComplete());
    }
}
