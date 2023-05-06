package am.demo.loans.controllers;

import am.demo.loans.model.Customer;
import am.demo.loans.model.Loans;
import am.demo.loans.repository.LoansRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LoansController {

    @Autowired
    private LoansRepository loansRepository;

    @PostMapping("/myLoans")
    String getLoansDetails(@RequestBody Integer integer) {

        return "Hello from loans. Received int: " + integer;
    }

    @GetMapping
    public String loans(){
        return "loans up and running";
    }


}
