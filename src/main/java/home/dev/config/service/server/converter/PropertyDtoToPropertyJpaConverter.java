package home.dev.config.service.server.converter;

import home.dev.config.service.server.repository.postgres.model.PropertyJpa;
import home.dev.config.service.server.service.model.PropertyDTO;
import home.dev.mapper.entity.Converter;
import org.springframework.stereotype.Component;

@Component
public class PropertyDtoToPropertyJpaConverter extends Converter<PropertyDTO, PropertyJpa> {

    @Override
    public PropertyJpa convert(PropertyDTO source, PropertyJpa destination) {
        destination.setId(source.getId());
        destination.setName(source.getName());
        return destination;
    }
}
