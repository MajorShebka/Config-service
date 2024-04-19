package home.dev.config.service.server.repository.mongo.repository;

import home.dev.config.service.server.repository.mongo.model.PropertyMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoPropertyRepository extends MongoRepository<PropertyMongo, String> {

}
