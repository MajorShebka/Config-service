package home.dev.config.service.server.converter;

import home.dev.config.service.server.repository.mongo.model.ConfigMongo;
import home.dev.config.service.server.service.model.ConfigDTO;
import home.dev.mapper.entity.Converter;
import org.springframework.stereotype.Component;

@Component
public class ConfigMongoToConfigDtoConverter extends Converter<ConfigMongo, ConfigDTO> {

    @Override
    public ConfigDTO convert(ConfigMongo source, ConfigDTO destination) {
        destination.setName(source.getName());
        destination.setValue(source.getValue());
        destination.setType(source.getType());
        destination.setId(Long.parseLong(source.getId()));
        return destination;
    }
}
