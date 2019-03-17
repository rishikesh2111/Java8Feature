package com.java.feature.JavaFeature;

import lib.example.service.LibService;

public class JavalibDemo {

    public static void main(String[] args){

        LibService libService = new LibService();
        libService.print();
        libService.buildMessage(" Welcome to application");
    }
}
