package com.tavant.accountmicroserviceserver.controller;

import com.tavant.accountmicroserviceserver.model.Account;
import com.tavant.accountmicroserviceserver.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    protected Logger logger=Logger.getLogger(AccountController.class.getName());

    @RequestMapping("/accounts")
    public Account[] all() {
        logger.info("accounts-microservice all() invoked");
        List<Account> accounts = accountRepository.getAllAccounts();
        logger.info("accounts-microservice all() found: " + accounts.size());
        return accounts.toArray(new Account[accounts.size()]);
    }

    @RequestMapping("/accounts/{id}")
    public Account byId(@PathVariable("id") String id) {
        logger.info("accounts-microservice byId() invoked: " + id);
        Account account = accountRepository.getAccount(id);
        logger.info("accounts-microservice byId() found: " + account);
        return account;
    }

}
