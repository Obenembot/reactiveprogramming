package com.example.reactiveprogramming.sec02;

import com.example.reactiveprogramming.courseUtil.Util;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

public class Lec03FluxFromArrayOrList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        Flux.fromIterable(integerList)
                .subscribe(Util.onNext(),Util.onError(),Util.onComplete());
        System.out.println();
        Integer[] array = {1, 2, 3, 4, 5};

        Flux.fromArray(array)
                .subscribe(Util.onNext(),Util.onError(),Util.onComplete());

    }
}
