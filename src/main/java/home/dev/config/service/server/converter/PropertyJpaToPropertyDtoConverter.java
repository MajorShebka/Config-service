package home.dev.config.service.server.converter;

import home.dev.config.service.server.repository.postgres.model.PropertyJpa;
import home.dev.config.service.server.service.model.ConfigDTO;
import home.dev.config.service.server.service.model.PropertyDTO;
import home.dev.mapper.entity.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PropertyJpaToPropertyDtoConverter extends Converter<PropertyJpa, PropertyDTO> {

    @Override
    public PropertyDTO convert(PropertyJpa source, PropertyDTO destination) {
        destination.setId(source.getId());
        destination.setName(source.getName());
        destination.setConfigs((List<ConfigDTO>) mapper.map(source.getConfigs(), new ArrayList<>(), ConfigDTO.class));
        return destination;
    }
}
