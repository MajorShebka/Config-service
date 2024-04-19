package home.dev.config.service.server.api.service;

import home.dev.config.service.server.api.message.property.*;
import home.dev.config.service.server.api.model.PropertyApi;
import home.dev.config.service.server.service.model.PropertyDTO;
import home.dev.config.service.server.service.service.PropertyService;
import home.dev.mapper.entity.DefaultMapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "PropertyApiService", description = "CRUD with properties")
@RequiredArgsConstructor
public class PropertyApiService {

    private final DefaultMapper mapper;
    private final PropertyService propertyService;

    @GetMapping("/property")
    public GetPropertyResponse getProperty(@RequestParam("id") Long id) {
        PropertyDTO property = propertyService.findProperty(id);
        return new GetPropertyResponse(mapper.map(property, PropertyApi.class));
    }

    @PostMapping("/property")
    public CreatePropertyResponse createProperty(@RequestBody CreatePropertyRequest request) {
        PropertyDTO propertyDTO = mapper.map(request.getProperty(), PropertyDTO.class);
        return new CreatePropertyResponse(mapper.map(propertyService.createProperty(propertyDTO), PropertyApi.class));
    }

    @PutMapping("/property")
    public UpdatePropertyResponse updateProperty(@RequestBody UpdatePropertyRequest request) {
        PropertyDTO propertyDTO = mapper.map(request.getProperty(), PropertyDTO.class);
        return new UpdatePropertyResponse(mapper.map(propertyService.updateProperty(propertyDTO), PropertyApi.class));
    }

    @DeleteMapping("/property")
    public RemovePropertyResponse removeProperty(@RequestBody RemovePropertyRequest request) {
        long id = request.getId();
        propertyService.removeProperty(id);
        return new RemovePropertyResponse();
    }
}
