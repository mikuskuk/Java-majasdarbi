package io.codelex.oop.summary.lazybox;

import java.util.function.Supplier;

public class LazyBox<T> {

    private T contents;
    private final Supplier<T> supplier;

    public LazyBox(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public T get() {
        if (contents == null) {
            contents = supplier.get();
        }
        return contents;
    }

}
