package com.example.reactiveprogramming.sec01;

import com.example.reactiveprogramming.courseUtil.Util;
import reactor.core.publisher.Mono;

public class Lecture04EmptyMonoOrError {
    public static void main(String[] args) {

        userRepository(6)
                .subscribe(Util.onNext(),
                        Util.onError(),
                        Util.onComplete());
    }

    private static Mono<String> userRepository(int userId) {

        if (userId == 1) {
            return Mono.just(Util.getFaker().address().country());
        } else if (userId == 2) {
            return Mono.empty();
        } else {
            return Mono.error(new RuntimeException("Not In the allowed range"));
        }

    }
}
