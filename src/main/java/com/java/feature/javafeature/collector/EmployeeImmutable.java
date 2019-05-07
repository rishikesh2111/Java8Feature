package com.java.feature.javafeature.collector;

import java.util.*;

public final class EmployeeImmutable {
    private final String name;
    private final int id;
    private final ArrayList<AddressImmutable> addresses;

    public EmployeeImmutable(String name, int id, ArrayList<AddressImmutable> addresses) {
        this.name = name;
        this.id = id;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public ArrayList<AddressImmutable> getAddresses() {
        //ArrayList<AddressImmutable> addressCopy = new ArrayList<>();
        return (ArrayList<AddressImmutable>) addresses.clone();

    }

    @Override
    public String toString() {
        return "EmployeeImmutable{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", addresses=" + addresses +
                '}';
    }
}
