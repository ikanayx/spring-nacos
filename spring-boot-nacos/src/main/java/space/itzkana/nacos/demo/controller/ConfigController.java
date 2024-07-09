package space.itzkana.nacos.demo.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("config")
public class ConfigController {

    /**
     * 使用OpenAPI更改配置值
     * curl -X POST "http://127.0.0.1:8848/nacos/v1/cs/configs?dataId=data&group=DEFAULT_GROUP&content=hello.version=1.0.1"
     */
    @NacosValue(value = "${hello.version:1.0.0}", autoRefreshed = true)
    private String version;

    @GetMapping
    public String sayHello(String name) {
        return "hello %s, nacos version %s".formatted(name, version);
    }
}
