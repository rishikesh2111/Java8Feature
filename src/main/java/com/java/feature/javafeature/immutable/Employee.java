package com.java.feature.javafeature.immutable;

import java.util.ArrayList;
import java.util.List;

public final class Employee {
    private final String name;
    private final ArrayList<Address> addresses;

    public Employee(String name, List<Address> addresses) {
        this.name = name;
        ArrayList<Address> addresses1 = new ArrayList<>();
        for(Address address: addresses){
            addresses1.add(address);
        }
        this.addresses = addresses1;
    }

    public String getName() {
        return name;
    }

    public List<Address> getAddresses() {
        /*List<Address> addr = new ArrayList<>();
        for(Address address: addresses){
            addr.add(address);
        }*/
        return (ArrayList)addresses.clone();
       // return addr;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}
