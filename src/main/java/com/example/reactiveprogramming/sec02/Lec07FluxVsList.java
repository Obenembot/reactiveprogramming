package com.example.reactiveprogramming.sec02;

import com.example.reactiveprogramming.courseUtil.Util;
import com.example.reactiveprogramming.sec02.helper.NameGenerator;

import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Lec07FluxVsList {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(10);
        latch.countDown();
        latch.countDown();
        latch.countDown();
        System.out.println(latch);
        List<String> list = NameGenerator.getNames(5);
        System.out.println(list);
        //FLUX OUTPUT DATA ONCE THE DATA IS AVAILABLE.
        NameGenerator.getNamesFlux(5)
                .subscribe(Util.onNext());
        System.out.println();
        NameGenerator.getNamesFlux(5)
                .collectList()
                .subscribe(Util.onNext());

    }
}
