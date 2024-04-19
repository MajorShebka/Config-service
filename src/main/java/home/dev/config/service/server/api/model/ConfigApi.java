package home.dev.config.service.server.api.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ConfigApi {

    private Long id;
    private String name;
    private String type;
    private String value;
    private Long property_id;
}
