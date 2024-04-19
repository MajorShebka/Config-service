package home.dev.config.service.server.converter;

import home.dev.config.service.server.repository.postgres.model.ConfigJpa;
import home.dev.config.service.server.service.model.ConfigDTO;
import home.dev.mapper.entity.Converter;
import org.springframework.stereotype.Component;

@Component
public class ConfigDtoToConfigJpaConverter extends Converter<ConfigDTO, ConfigJpa> {

    @Override
    public ConfigJpa convert(ConfigDTO source, ConfigJpa destination) {
        destination.setId(source.getId());
        destination.setName(source.getName());
        destination.setType(source.getType());
        destination.setValue(source.getValue());
        destination.setProperty_id(source.getProperty_id());
        return destination;
    }
}
