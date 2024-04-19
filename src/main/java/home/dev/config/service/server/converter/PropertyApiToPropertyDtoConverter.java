package home.dev.config.service.server.converter;

import home.dev.config.service.server.api.model.PropertyApi;
import home.dev.config.service.server.service.model.ConfigDTO;
import home.dev.config.service.server.service.model.PropertyDTO;
import home.dev.mapper.entity.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PropertyApiToPropertyDtoConverter extends Converter<PropertyApi, PropertyDTO> {

    @Override
    public PropertyDTO convert(PropertyApi source, PropertyDTO destination) {
        destination.setId(source.getId());
        destination.setName(source.getName());
        destination.setConfigs((List<ConfigDTO>) mapper.map(source.getConfigs(), new ArrayList<>(), ConfigDTO.class));
        return destination;
    }
}
