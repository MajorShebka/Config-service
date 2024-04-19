package home.dev.config.service.server.service.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PropertyDTO {

    private Long id;
    private String name;
    private List<ConfigDTO> configs;
}
