package am.demo.accounts.controller;

import am.demo.accounts.config.AccountsServiceConfig;
import am.demo.accounts.model.Accounts;
import am.demo.accounts.model.Customer;
import am.demo.accounts.models.Properties;
import am.demo.accounts.repository.AccountsRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountsController {

    private final AccountsRepository accountsRepository;
    private final AccountsServiceConfig accountsConfig;

    @PostMapping("/myAccount")
    public Accounts getAccountDetails(@RequestBody Customer customer) {

        Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId());
        if (accounts != null) {
            return accounts;
        } else {
            return null;
        }

    }

    @GetMapping("/get")
    public String account(){
        return "accounts up and running";
    }


    @GetMapping("/properties")
    public String properties() throws JsonProcessingException {

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        am.demo.accounts.models.Properties properties = new Properties(accountsConfig.getMsg(), accountsConfig.getBuildVersion(), accountsConfig.getAnsis(), accountsConfig.getActiveBranches());
        String jsonStr = ow.writeValueAsString(properties);

        System.out.println("\n\n\njsonString: " + jsonStr + "\n\n\n");
        return jsonStr;

    }
}
