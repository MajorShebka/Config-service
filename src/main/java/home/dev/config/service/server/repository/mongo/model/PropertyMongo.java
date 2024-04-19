package home.dev.config.service.server.repository.mongo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import static home.dev.config.service.server.constants.Constants.Mongo.Document.PROPERTIES;

@Document(collection = PROPERTIES)
@Getter
@Setter
public class PropertyMongo {

    @MongoId
    private String _id;
    private String name;
}
