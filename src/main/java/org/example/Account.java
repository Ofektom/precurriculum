package org.example;

import java.util.Objects;
import java.util.Set;

public class Account {
    private Customer customer;
    private long number;
    private double balance;

    public Account() {
    }

    public Account(Customer customer, long number, double balance) {
        this.customer = customer;
        this.number = number;
        this.balance = balance;
    }

    public Customer getName() {
        return customer;
    }

    public void setName(Customer customer) {
        this.customer = customer;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + customer + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return number == account.number && Double.compare(balance, account.balance) == 0 && Objects.equals(customer, account.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer, number, balance);
    }
}
