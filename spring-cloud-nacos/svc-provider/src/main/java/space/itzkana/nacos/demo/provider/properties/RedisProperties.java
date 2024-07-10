package space.itzkana.nacos.demo.provider.properties;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component
@ConfigurationProperties(prefix = "redis", ignoreInvalidFields = true)
@RefreshScope
public class RedisProperties {

    private String host;

    private int port;

    private String password;
}
