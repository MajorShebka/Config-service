package home.dev.config.service.server.api.message.config;

import home.dev.config.service.server.api.message.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RemoveConfigResponse extends BaseResponse {

    private Long id;
}
