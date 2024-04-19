package home.dev.config.service.server.repository.postgres.repository;

import home.dev.config.service.server.repository.postgres.model.PropertyJpa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaPropertyRepository extends CrudRepository<PropertyJpa, Long> {
}
