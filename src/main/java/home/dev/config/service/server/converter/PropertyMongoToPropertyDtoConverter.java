package home.dev.config.service.server.converter;

import home.dev.config.service.server.repository.mongo.model.PropertyMongo;
import home.dev.config.service.server.service.model.PropertyDTO;
import home.dev.mapper.entity.Converter;
import org.springframework.stereotype.Component;

@Component
public class PropertyMongoToPropertyDtoConverter extends Converter<PropertyMongo, PropertyDTO> {

    @Override
    public PropertyDTO convert(PropertyMongo source, PropertyDTO destination) {
        destination.setName(source.getName());
        return destination;
    }
}
