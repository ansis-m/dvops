package am.demo.accounts.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("cards")
public interface CardsFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "myCards", consumes = "application/json")
    String getCardDetails();
}
