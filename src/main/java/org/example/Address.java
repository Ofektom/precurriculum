package org.example;

public class Address {
    private Integer homeNumber;

    private String streetName;

    public Address(Integer homeNumber, String streetName) {
        this.homeNumber = homeNumber;
        this.streetName = streetName;
    }

    public Integer getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(Integer homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Override
    public String toString() {
        return "Address{" +
                "homeNumber=" + homeNumber +
                ", streetName='" + streetName + '\'' +
                '}';
    }

}
