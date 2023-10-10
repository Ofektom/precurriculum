package org.example;

import java.util.Objects;
import java.util.Set;

public class Address {
    private long homeNumber;
    private String streetName;
    private Set<String> city;
    private Set<String> state;

    public Address() {
    }

    public Address(long homeNumber, String streetName, Set<String> city, Set<String> state) {
        this.homeNumber = homeNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
    }

    public long getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(long homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Set<String> getCity() {
        return city;
    }

    public void setCity(Set<String> city) {
        this.city = city;
    }

    public Set<String> getState() {
        return state;
    }

    public void setState(Set<String> state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "homeNumber=" + homeNumber +
                ", streetName='" + streetName + '\'' +
                ", city=" + city +
                ", state=" + state +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return homeNumber == address.homeNumber && Objects.equals(streetName, address.streetName) && Objects.equals(city, address.city) && Objects.equals(state, address.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(homeNumber, streetName, city, state);
    }
}
