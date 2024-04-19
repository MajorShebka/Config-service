package home.dev.config.service.server.api.service;

import home.dev.config.service.server.api.message.config.*;
import home.dev.config.service.server.api.model.ConfigApi;
import home.dev.config.service.server.service.model.ConfigDTO;
import home.dev.config.service.server.service.service.ConfigService;
import home.dev.mapper.entity.DefaultMapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Tag(name = "ConfigApiService", description = "CRUD with configs")
public class ConfigApiService {

    private final DefaultMapper mapper;
    private final ConfigService configService;

    @GetMapping("/config")
    public GetConfigResponse getConfig(@RequestParam("id") Long id) {
        return new GetConfigResponse(mapper.map(configService.findProperty(id), ConfigApi.class));
    }

    @PostMapping("/config")
    public CreateConfigResponse createConfig(@RequestBody CreateConfigRequest request) {
        ConfigDTO config = configService.createConfig(mapper.map(request.getConfig(), ConfigDTO.class));
        return new CreateConfigResponse(mapper.map(config, ConfigApi.class));
    }

    @PutMapping("/config")
    public UpdateConfigResponse updateProperty(@RequestBody UpdateConfigRequest request) {
        ConfigDTO config = configService.updateProperty(mapper.map(request.getConfig(), ConfigDTO.class));
        return new UpdateConfigResponse(mapper.map(config, ConfigApi.class));
    }

    @DeleteMapping("/config")
    public RemoveConfigResponse removeProperty(@RequestBody RemoveConfigRequest request) {
        configService.removeProperty(request.getId());
        return new RemoveConfigResponse(request.getId());
    }
}
