package org.example;

import java.time.LocalDate;
import java.util.Objects;

public class Transaction {
    private long id;
    private double amount;
    private LocalDate date;

    public Transaction() {
    }

    public Transaction(long id, double amount, LocalDate date) {
        this.id = id;
        this.amount = amount;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return id == that.id && Double.compare(amount, that.amount) == 0 && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, date);
    }
}
