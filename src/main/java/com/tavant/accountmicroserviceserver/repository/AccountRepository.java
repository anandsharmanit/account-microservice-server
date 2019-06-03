package com.tavant.accountmicroserviceserver.repository;

import com.tavant.accountmicroserviceserver.model.Account;

import java.util.List;

public interface AccountRepository {

    List<Account> getAllAccounts();
    Account getAccount(String number);
}
