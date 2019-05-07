package com.java.feature.javafeature.collector;

import java.util.ArrayList;

public class ImmutableClassTester {

    public static void main(String[] args){
        AddressImmutable homeAddress = new AddressImmutable("8380077002", "B 203", "Lane no 13", "Pune");
        AddressImmutable officeAddress = new AddressImmutable("2724061", "14-095", "EON Kharadi", "Pune");
        ArrayList<AddressImmutable> addresse = new ArrayList<>();
        addresse.add(homeAddress);
       // addresse.add(officeAddress);
        EmployeeImmutable employeeImmutable = new EmployeeImmutable("Rishi", 1001,addresse);
        System.out.println(employeeImmutable);
        employeeImmutable.getAddresses().add(0,new AddressImmutable("101","false","false","false"));
        System.out.println(employeeImmutable);

    }
}
