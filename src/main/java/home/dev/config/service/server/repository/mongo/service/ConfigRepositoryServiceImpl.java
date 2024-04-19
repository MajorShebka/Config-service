package home.dev.config.service.server.repository.mongo.service;

import home.dev.config.service.server.repository.mongo.model.ConfigMongo;
import home.dev.config.service.server.repository.mongo.repository.MongoConfigRepository;
import home.dev.config.service.server.service.ConfigRepositoryService;
import home.dev.config.service.server.service.model.ConfigDTO;
import home.dev.mapper.entity.DefaultMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("mongoConfigRepo")
@RequiredArgsConstructor
public class ConfigRepositoryServiceImpl implements ConfigRepositoryService {

    private final DefaultMapper mapper;
    private final MongoConfigRepository mongoConfigRepository;

    @Override
    public ConfigDTO findById(long id) {
        return mapper.map(mongoConfigRepository.findById(String.valueOf(id)).orElse(null), ConfigDTO.class);
    }

    @Override
    public ConfigDTO create(ConfigDTO property) {
        ConfigMongo config = mongoConfigRepository.insert(mapper.map(property, ConfigMongo.class));
        return mapper.map(config, ConfigDTO.class);
    }

    @Override
    public ConfigDTO update(ConfigDTO property) {
        ConfigMongo config = mongoConfigRepository.save(mapper.map(property, ConfigMongo.class));
        return mapper.map(config, ConfigDTO.class);
    }

    @Override
    public void remove(long id) {
        ConfigMongo config = new ConfigMongo();
        config.setId(String.valueOf(id));
        mongoConfigRepository.delete(config);
    }
}
