package pl.hexagon.application.port.in;

import pl.hexagon.application.port.out.PersistFooOutputPort;
import pl.hexagon.domain.Foo;

import java.util.Random;

public class CreateFooInputPort {
    private final PersistFooOutputPort fooOutputPort;

    public CreateFooInputPort(PersistFooOutputPort fooOutputPort) {
        this.fooOutputPort = fooOutputPort;
    }

    public void createFoo(FooCreateCommand fooCreate) {
        System.out.println("Creating Foo");
        Foo foo = Foo.withoutId("Next Foo" + new Random().nextInt());
        fooOutputPort.save(foo);
    }

    public record FooCreateCommand(String title){}
}
