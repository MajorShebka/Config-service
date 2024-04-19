package home.dev.config.service.server.api.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PropertyApi {

    private Long id;
    private String name;
    private List<ConfigApi> configs;
}
