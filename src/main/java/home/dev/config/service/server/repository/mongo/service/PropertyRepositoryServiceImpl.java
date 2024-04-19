package home.dev.config.service.server.repository.mongo.service;

import home.dev.config.service.server.service.PropertyRepositoryService;
import home.dev.config.service.server.service.model.PropertyDTO;
import home.dev.mapper.entity.DefaultMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("mongoPropertyRepo")
@RequiredArgsConstructor
public class PropertyRepositoryServiceImpl implements PropertyRepositoryService {

    private final DefaultMapper mapper;

    @Override
    public PropertyDTO findById(long id) {
        return null;
    }

    @Override
    public PropertyDTO create(PropertyDTO property) {
        return null;
    }

    @Override
    public PropertyDTO update(PropertyDTO property) {
        return null;
    }

    @Override
    public void remove(long id) {

    }
}
