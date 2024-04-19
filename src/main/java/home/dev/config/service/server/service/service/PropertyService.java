package home.dev.config.service.server.service.service;

import home.dev.config.service.server.service.PropertyRepositoryService;
import home.dev.config.service.server.service.model.PropertyDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PropertyService {

    private final PropertyRepositoryService postgresPropertyRepo;

    public PropertyDTO createProperty(PropertyDTO propertyDTO) {
        return postgresPropertyRepo.create(propertyDTO);
    }

    public PropertyDTO findProperty(long id) {
        return postgresPropertyRepo.findById(id);
    }

    public PropertyDTO updateProperty(PropertyDTO property) {
        return postgresPropertyRepo.update(property);
    }

    public void removeProperty(long id) {
        postgresPropertyRepo.remove(id);
    }
}
