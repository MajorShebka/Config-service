package home.dev.config.service.server.converter;

import home.dev.config.service.server.repository.mongo.model.ConfigMongo;
import home.dev.config.service.server.service.model.ConfigDTO;
import home.dev.mapper.entity.Converter;
import org.springframework.stereotype.Component;

@Component
public class ConfigDtoToConfigMongoConverter extends Converter<ConfigDTO, ConfigMongo> {

    @Override
    public ConfigMongo convert(ConfigDTO source, ConfigMongo destination) {
        destination.setId(String.valueOf(source.getId()));
        destination.setName(source.getName());
        destination.setType(source.getType());
        destination.setValue(source.getValue());
        return destination;
    }
}
