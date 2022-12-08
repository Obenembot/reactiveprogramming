package com.example.reactiveprogramming.sec03.helper;

import com.example.reactiveprogramming.courseUtil.Util;
import reactor.core.publisher.FluxSink;

import java.util.function.Consumer;

public class NameProducer implements Consumer<FluxSink<String>> {

    private FluxSink<String> fluxSink;

    /**
     * Performs this operation on the given argument.
     *
     * @param stringFluxSink the input argument
     */
    @Override
    public void accept(FluxSink<String> stringFluxSink) {
        this.fluxSink = stringFluxSink;
    }

    public void producer() {
        String name = Util.getFaker().name().fullName();
        String thread = Thread.currentThread().getName();
        this.fluxSink.next(thread + " : " + name);
    }
}
