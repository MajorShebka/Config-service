package home.dev.config.service.server.repository.postgres.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "properties")
@Getter
@Setter
public class PropertyJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    @SequenceGenerator(name = "seq", sequenceName = "property_seq", allocationSize = 1)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "property_id")
    private List<ConfigJpa> configs;
}
