package home.dev.config.service.server.converter;

import home.dev.config.service.server.api.model.ConfigApi;
import home.dev.config.service.server.api.model.PropertyApi;
import home.dev.config.service.server.service.model.PropertyDTO;
import home.dev.mapper.entity.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PropertyDtoToPropertyApiConverter extends Converter<PropertyDTO, PropertyApi> {
    @Override
    public PropertyApi convert(PropertyDTO source, PropertyApi destination) {
        destination.setId(source.getId());
        destination.setName(source.getName());
        destination.setConfigs((List<ConfigApi>) mapper.map(source.getConfigs(), new ArrayList<>(), ConfigApi.class));
        return destination;
    }
}
