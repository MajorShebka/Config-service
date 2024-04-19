package home.dev.config.service.server.service;

import home.dev.config.service.server.service.model.ConfigDTO;
import home.dev.config.service.server.service.model.PropertyDTO;

public interface ConfigRepositoryService {

    ConfigDTO findById(long id);

    ConfigDTO create(ConfigDTO property);

    ConfigDTO update(ConfigDTO property);

    void remove(long id);
}
