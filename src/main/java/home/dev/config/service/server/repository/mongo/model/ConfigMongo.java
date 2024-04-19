package home.dev.config.service.server.repository.mongo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

import static home.dev.config.service.server.constants.Constants.Mongo.Document.CONFIGS;

@Document(collection = CONFIGS)
@Getter
@Setter
public class ConfigMongo {

    @MongoId
    private String id;
    private String name;
    private String type;
    private String value;
}
