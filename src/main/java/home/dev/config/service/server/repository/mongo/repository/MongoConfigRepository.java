package home.dev.config.service.server.repository.mongo.repository;

import home.dev.config.service.server.repository.mongo.model.ConfigMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoConfigRepository extends MongoRepository<ConfigMongo, String> {
}
