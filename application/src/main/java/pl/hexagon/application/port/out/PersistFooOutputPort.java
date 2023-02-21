package pl.hexagon.application.port.out;

import pl.hexagon.domain.Foo;

public interface PersistFooOutputPort {
    void save(Foo foo);
}
