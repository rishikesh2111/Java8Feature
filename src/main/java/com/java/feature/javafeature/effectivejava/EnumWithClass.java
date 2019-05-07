package com.java.feature.javafeature.effectivejava;

public class EnumWithClass {
    public static final EnumWithClass LARGE = new EnumWithClass(10);
    public static final EnumWithClass MEDIUM = new EnumWithClass(7);
    public static final EnumWithClass SMALL = new EnumWithClass(5);
    public int size;
    public EnumWithClass(int size){
        this.size = size;
    }
    public int getSize(){
        return size;
    }
}

class CustomEnumUser{
    public static void main(String[] args){
        makeCoffe();
    }

    private static void makeCoffe(){
        System.out.println("Making coffee of size: "+getSize(EnumWithClass.LARGE));
    }
    private static int getSize(EnumWithClass size){
        System.out.println(size.getSize());
        return size.getSize();
    }
}
