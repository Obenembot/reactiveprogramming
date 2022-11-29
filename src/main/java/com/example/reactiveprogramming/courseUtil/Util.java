package com.example.reactiveprogramming.courseUtil;

import com.github.javafaker.Faker;
import org.reactivestreams.Subscriber;

import java.util.Locale;
import java.util.concurrent.Flow;
import java.util.function.Consumer;

public class Util {

    private static Faker FAKER = Faker.instance();

    public static Consumer<Object> onNext() {
        return o -> System.out.println("Received: " + o);
    }

    public static Consumer<Throwable> onError() {
        return e -> System.out.println("Error: " + e.getMessage());
    }

    public static Runnable onComplete() {
        return () -> System.out.println("Complete: ");
    }

    public static Faker getFaker() {
//    return    Faker.instance(Locale.ITALY);
        return FAKER;
    }

    public static void sleepSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public  static Subscriber<Object> subscriber(){
        return new DefaultSubscriber();
    }

    public  static Subscriber<Object> subscriber(String name){
        return new DefaultSubscriber(name);
    }
}
