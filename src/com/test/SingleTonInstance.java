package com.test;

public class SingleTonInstance {
    private static SingleTonInstance instance;
    private SingleTonInstance(){}
    public static SingleTonInstance getInstance(){
        if(instance == null){
            instance = new SingleTonInstance();
        }
        return instance;
    }
}
