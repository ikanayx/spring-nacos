package space.itzkana.nacos.demo.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("healthCheck")
public class HealthCheckController {

    @GetMapping("alive")
    public String reply() {
        return "I'm alive, not dead.";
    }
}
