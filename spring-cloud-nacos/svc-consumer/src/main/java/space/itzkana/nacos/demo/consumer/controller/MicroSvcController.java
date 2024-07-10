package space.itzkana.nacos.demo.consumer.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import space.itzkana.nacos.demo.consumer.service.feign.ProviderSvc;

@RestController
@RequiredArgsConstructor
@Slf4j
public class MicroSvcController {

    private final ProviderSvc providerSvc;

    @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
    public String echo(@PathVariable String str) {
        return providerSvc.echo(str);
    }
}
