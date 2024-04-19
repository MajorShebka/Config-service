package home.dev.config.service.server.repository.postgres.service;

import home.dev.config.service.server.repository.postgres.model.PropertyJpa;
import home.dev.config.service.server.repository.postgres.repository.JpaPropertyRepository;
import home.dev.config.service.server.service.PropertyRepositoryService;
import home.dev.config.service.server.service.model.PropertyDTO;
import home.dev.mapper.entity.DefaultMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("postgresPropertyRepo")
@RequiredArgsConstructor
public class PropertyRepositoryServiceImpl implements PropertyRepositoryService {

    private final DefaultMapper mapper;
    private final JpaPropertyRepository jpaPropertyRepository;

    @Override
    public PropertyDTO findById(long id) {
        return mapper.map(jpaPropertyRepository.findById(id).orElse(null), PropertyDTO.class);
    }

    @Override
    public PropertyDTO create(PropertyDTO property) {
        PropertyJpa propertyJpa = jpaPropertyRepository.save(mapper.map(property, PropertyJpa.class));
        return mapper.map(propertyJpa, PropertyDTO.class);
    }

    @Override
    public PropertyDTO update(PropertyDTO property) {
        PropertyJpa propertyJpa = jpaPropertyRepository.save(mapper.map(property, PropertyJpa.class));
        return mapper.map(propertyJpa, PropertyDTO.class);
    }

    @Override
    public void remove(long id) {
        jpaPropertyRepository.deleteById(id);
    }
}
