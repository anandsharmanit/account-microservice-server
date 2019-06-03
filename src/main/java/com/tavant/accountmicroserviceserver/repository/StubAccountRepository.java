package com.tavant.accountmicroserviceserver.repository;

import com.tavant.accountmicroserviceserver.model.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Repository
public class StubAccountRepository implements AccountRepository {

    private Map<String, Account> accountsByNumber = new HashMap<String, Account>();
    protected Logger logger=Logger.getLogger(StubAccountRepository.class.getName());

    public StubAccountRepository() {
        Account account = new Account(1000l, "5115" , "Arnav");
        accountsByNumber.put("5115", account);
        account = new Account(2000l, "2089" , "Anamika");
        accountsByNumber.put("2089", account);
        account = new Account(3000l, "1286" , "Dinesh");
        accountsByNumber.put("1286", account);
        logger.info("Created StubAccountRepository");
    }

    @Override
    public List<Account> getAllAccounts() {
        return new ArrayList<Account>(accountsByNumber.values());
    }

    @Override
    public Account getAccount(String number) {

        return accountsByNumber.get(number);
    }
}
