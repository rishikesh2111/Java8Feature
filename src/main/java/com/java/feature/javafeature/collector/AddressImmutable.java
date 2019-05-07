package com.java.feature.javafeature.collector;

public final class AddressImmutable {

    private final String cellNo;
    private final String flatNo;
    private final String streetNo;
    private final String city;

    public AddressImmutable(String cellNo, String flatNo, String streetNo, String city) {
        this.cellNo = cellNo;
        this.flatNo = flatNo;
        this.streetNo = streetNo;
        this.city = city;
    }

    public String getCellNo() {
        return cellNo;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "AddressImmutable{" +
                "cellNo='" + cellNo + '\'' +
                ", flatNo='" + flatNo + '\'' +
                ", streetNo='" + streetNo + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
