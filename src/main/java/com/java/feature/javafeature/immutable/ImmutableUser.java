package com.java.feature.javafeature.immutable;

import java.util.ArrayList;
import java.util.List;

public class ImmutableUser {

    public static void main(String [] args){
        Address address = new Address("Goodwill", "tingrenagar");
        List<Address> addresses = new ArrayList<>();
        addresses.add(address);
        Employee employee = new Employee("Rishi",addresses);
        System.out.println(employee);
        employee.getAddresses().add(new Address("Nidhi","Viman nagat"));
        System.out.println(employee);
        addresses.add(1, new Address("Goodwill", "vishrantwadi"));
        System.out.println(employee);


    }

}
