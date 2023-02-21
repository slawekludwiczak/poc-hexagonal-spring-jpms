package pl.hexagon.adapter.persistence;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface FooEntityRepository extends CrudRepository<FooEntity, UUID> {
}
