package home.dev.config.service.server.api.message.property;

import home.dev.config.service.server.api.model.ConfigApi;
import home.dev.config.service.server.api.model.PropertyApi;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdatePropertyRequest {

    private PropertyApi property;
}
