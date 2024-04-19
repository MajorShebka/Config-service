package home.dev.config.service.server.repository.postgres.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "configs")
@Getter
@Setter
public class ConfigJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    @SequenceGenerator(name = "seq", sequenceName = "config_seq", allocationSize = 1)
    private Long id;
    private String name;
    private String type;
    private String value;
    private Long property_id;
}
