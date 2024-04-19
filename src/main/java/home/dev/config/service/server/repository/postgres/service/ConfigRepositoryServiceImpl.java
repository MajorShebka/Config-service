package home.dev.config.service.server.repository.postgres.service;

import home.dev.config.service.server.repository.postgres.model.ConfigJpa;
import home.dev.config.service.server.repository.postgres.repository.JpaConfigRepository;
import home.dev.config.service.server.service.ConfigRepositoryService;
import home.dev.config.service.server.service.model.ConfigDTO;
import home.dev.mapper.entity.DefaultMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("postgresConfigRepo")
@RequiredArgsConstructor
public class ConfigRepositoryServiceImpl implements ConfigRepositoryService {

    private final DefaultMapper mapper;
    private final JpaConfigRepository jpaConfigRepository;

    @Override
    public ConfigDTO findById(long id) {
        return mapper.map(jpaConfigRepository.findById(id).orElse(null), ConfigDTO.class);
    }

    @Override
    public ConfigDTO create(ConfigDTO property) {
        ConfigJpa configJpa = jpaConfigRepository.save(mapper.map(property, ConfigJpa.class));
        return mapper.map(configJpa, ConfigDTO.class);
    }

    @Override
    public ConfigDTO update(ConfigDTO property) {
        ConfigJpa configJpa = jpaConfigRepository.save(mapper.map(property, ConfigJpa.class));
        return mapper.map(configJpa, ConfigDTO.class);
    }

    @Override
    public void remove(long id) {
        jpaConfigRepository.deleteById(id);
    }
}
