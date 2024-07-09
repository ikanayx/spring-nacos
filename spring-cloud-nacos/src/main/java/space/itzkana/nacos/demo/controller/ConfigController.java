package space.itzkana.nacos.demo.controller;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import space.itzkana.nacos.demo.properties.RedisProperties;

@RestController
@RequestMapping("config")
@RefreshScope
@RequiredArgsConstructor
@Data
public class ConfigController {

    @Value("${hello.version:1.0.0}")
    private String version;

    private final RedisProperties redisProps;

    @GetMapping("hello")
    public String hello() {
        System.out.println(redisProps);
        return "Hello, nacos configure version: " + version;
    }
}
