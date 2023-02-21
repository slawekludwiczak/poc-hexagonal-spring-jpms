package pl.hexagon.adapter.persistence;

import org.springframework.stereotype.Component;
import pl.hexagon.application.port.out.PersistFooOutputPort;
import pl.hexagon.domain.Foo;

@Component
class PersistFooAdapter implements PersistFooOutputPort {

    private final FooEntityRepository fooEntityRepository;

    public PersistFooAdapter(FooEntityRepository fooEntityRepository) {
        this.fooEntityRepository = fooEntityRepository;
    }

    @Override
    public void save(Foo foo) {
        FooEntity fooEntity = new FooEntity();
        fooEntity.setId(foo.getId().id());
        fooEntity.setTitle(foo.getTitle());
        fooEntityRepository.save(fooEntity);
    }
}
