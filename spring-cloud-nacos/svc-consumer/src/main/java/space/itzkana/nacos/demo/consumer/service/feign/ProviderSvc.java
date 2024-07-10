package space.itzkana.nacos.demo.consumer.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "svc-provider")
public interface ProviderSvc {

    /**
     * demo feign 接口
     */
    @GetMapping(value = "/echo/{str}")
    String echo(@PathVariable String str);
}
