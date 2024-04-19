package home.dev.config.service.server.api.message.config;

import home.dev.config.service.server.api.message.BaseResponse;
import home.dev.config.service.server.api.model.ConfigApi;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateConfigResponse extends BaseResponse {

    private ConfigApi config;
}
