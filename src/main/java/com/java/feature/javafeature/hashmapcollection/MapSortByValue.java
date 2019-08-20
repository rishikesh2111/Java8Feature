package com.java.feature.javafeature.hashmapcollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import static java.util.stream.Collectors.*;


public class MapSortByValue {

    public static void main(String ... args){
        Map<Key, Value> keyValueMap = new HashMap<>();
        Key key1 = new Key("apple","1008");
        Value value1 = new Value("apple",100F,"1008");
        Key key2 = new Key("mango","1010");
        Value value2 = new Value("mango",110F,"1010");
        Key key3 = new Key("orange","1003");
        Value value3 = new Value("orange",102F,"1003");
        Key key4 = new Key("banana","1012");
        Value value4 = new Value("banana",190F,"1012");
        Key key5 = new Key("pomegranate","1014");
        Value value5 = new Value("pomegranate",210F,"1014");
        keyValueMap.put(key1, value1);
        keyValueMap.put(key2, value2);
        keyValueMap.put(key3, value3);
        keyValueMap.put(key4, value4);
        keyValueMap.put(key5, value5);

        System.out.println(keyValueMap);
        LinkedHashMap<Key, Value> sortedMap = keyValueMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(toMap(Map.Entry::getKey,Map.Entry::getValue, (k,v) -> k, LinkedHashMap::new));
       System.out.println(sortedMap);

    }

}

class Key{
    private String name;
    private String seriaalId;


    public Key(String name, String seriaalId) {
        this.name = name;
        this.seriaalId = seriaalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeriaalId() {
        return seriaalId;
    }

    public void setSeriaalId(String seriaalId) {
        this.seriaalId = seriaalId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return getName().equals(key.getName()) &&
                getSeriaalId().equals(key.getSeriaalId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSeriaalId());
    }

    @Override
    public String toString() {
        return "Key{" +
                "name='" + name + '\'' +
                ", seriaalId='" + seriaalId + '\'' +
                '}';
    }
}

class Value implements Comparable<Value>{
    public Value(String name, float price, String serialId) {
        this.name = name;
        this.price = price;
        this.serialId = serialId;
    }

    private String name;
    private float price;
    private String serialId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value = (Value) o;
        return Float.compare(value.getPrice(), getPrice()) == 0 &&
                getName().equals(value.getName()) &&
                getSerialId().equals(value.getSerialId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getSerialId());
    }

    @Override
    public String toString() {
        return "Value{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", serialId='" + serialId + '\'' +
                '}';
    }
    @Override
    public int compareTo(Value value) {
        return this.serialId.compareTo(value.getSerialId());
    }
}
