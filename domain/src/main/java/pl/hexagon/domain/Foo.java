package pl.hexagon.domain;

import java.util.UUID;

public class Foo {
    private FooId id;
    private String title;

    private Foo(){}

    public static Foo withoutId(String title) {
        Foo foo = new Foo();
        foo.id = new FooId(UUID.randomUUID());
        foo.title = title;
        return foo;
    }

    public FooId getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }


}
