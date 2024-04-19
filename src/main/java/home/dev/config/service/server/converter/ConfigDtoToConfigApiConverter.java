package home.dev.config.service.server.converter;

import home.dev.config.service.server.api.model.ConfigApi;
import home.dev.config.service.server.service.model.ConfigDTO;
import home.dev.mapper.entity.Converter;
import org.springframework.stereotype.Component;

@Component
public class ConfigDtoToConfigApiConverter extends Converter<ConfigDTO, ConfigApi> {

    @Override
    public ConfigApi convert(ConfigDTO source, ConfigApi destination) {
        destination.setId(source.getId());
        destination.setName(source.getName());
        destination.setType(source.getType());
        destination.setValue(source.getValue());
        destination.setProperty_id(source.getProperty_id());
        return destination;
    }
}
