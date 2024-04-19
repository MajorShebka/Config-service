package home.dev.config.service.server.service.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ConfigDTO {

    private Long id;
    private String name;
    private String type;
    private String value;
    private Long property_id;
}
