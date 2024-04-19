package home.dev.config.service.server.service.service;

import home.dev.config.service.server.service.ConfigRepositoryService;
import home.dev.config.service.server.service.model.ConfigDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConfigService {

    private final ConfigRepositoryService postgresConfigRepo;

    public ConfigDTO createConfig(ConfigDTO configDTO) {
        return postgresConfigRepo.create(configDTO);
    }

    public ConfigDTO findProperty(long id) {
        return postgresConfigRepo.findById(id);
    }

    public ConfigDTO updateProperty(ConfigDTO config) {
        return postgresConfigRepo.update(config);
    }

    public void removeProperty(long id) {
        postgresConfigRepo.remove(id);
    }
}
