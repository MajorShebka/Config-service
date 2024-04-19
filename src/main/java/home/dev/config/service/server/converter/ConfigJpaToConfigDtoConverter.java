package home.dev.config.service.server.converter;

import home.dev.config.service.server.repository.postgres.model.ConfigJpa;
import home.dev.config.service.server.service.model.ConfigDTO;
import home.dev.mapper.entity.Converter;
import org.springframework.stereotype.Component;

@Component
public class ConfigJpaToConfigDtoConverter extends Converter<ConfigJpa, ConfigDTO> {

    @Override
    public ConfigDTO convert(ConfigJpa source, ConfigDTO destination) {
        destination.setId(source.getId());
        destination.setName(source.getName());
        destination.setValue(source.getValue());
        destination.setType(source.getType());
        destination.setProperty_id(source.getProperty_id());
        return destination;
    }
}
