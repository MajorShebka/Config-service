package home.dev.config.service.server.configuration;

import home.dev.mapper.entity.Converter;
import home.dev.mapper.entity.DefaultMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Set;

@Configuration
public class MapperConfiguration {

    @Bean
    public DefaultMapper mapper(@Autowired Set<Converter> converters) {
        DefaultMapper mapper = new DefaultMapper();
        mapper.setConverters(converters);
        return mapper;
    }
}
