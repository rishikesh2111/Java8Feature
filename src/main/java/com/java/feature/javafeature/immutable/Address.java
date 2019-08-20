package com.java.feature.javafeature.immutable;

public final class Address {

    private final String building;
    private final String street;

    public Address(String building, String street) {
        this.building = building;
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "building='" + building + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
