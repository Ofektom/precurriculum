package org.example;

import java.util.Objects;

public class Customer {
    private String name;
    private Address address;
    private long phone;

    public Customer() {
    }

    public Customer(String name, Address address, long phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", phone=" + phone +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return phone == customer.phone && Objects.equals(name, customer.name) && Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, phone);
    }
}
