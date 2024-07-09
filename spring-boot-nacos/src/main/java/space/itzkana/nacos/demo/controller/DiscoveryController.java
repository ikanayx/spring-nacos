package space.itzkana.nacos.demo.controller;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("discovery")
public class DiscoveryController {

    /**
     * 通过OpenAPI注册服务
     * curl -X POST 'http://127.0.0.1:8848/nacos/v1/ns/instance?serviceName=example&ip=127.0.0.1&port=8080'
     */
    @NacosInjected
    private NamingService namingService;

    @GetMapping
    public List<Instance> sayHello(String serviceName) throws NacosException {
        return namingService.getAllInstances(serviceName);
    }
}
