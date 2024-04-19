package home.dev.config.service.server.service;

import home.dev.config.service.server.service.model.PropertyDTO;

public interface PropertyRepositoryService {

    PropertyDTO findById(long id);

    PropertyDTO create(PropertyDTO property);

    PropertyDTO update(PropertyDTO property);

    void remove(long id);
}
