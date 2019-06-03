package com.tavant.accountmicroserviceserver.model;


import java.io.Serializable;
import java.util.Objects;

public class Account implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long amount;
    private String number;
    private String name;

    public Account(Long amount, String number, String name) {
        this.amount = amount;
        this.number = number;
        this.name = name;
    }

    public Account() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(amount, account.amount) &&
                Objects.equals(number, account.number) &&
                Objects.equals(name, account.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, number, name);
    }

    @Override
    public String toString() {
        return "Account{" +
                "amount=" + amount +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
