package am.demo.accounts.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("loans")
public interface LoansFeignClient {

    @RequestMapping(method = RequestMethod.POST, value = "myLoans", consumes = "application/json")
    String getLoanDetails(@RequestBody Integer integer);
}

