package com.test;

public class NumberModel implements Comparable<NumberModel>{
    Integer inputNumber;


    @Override
    public int compareTo(NumberModel numberModel) {
        return this.inputNumber - numberModel.inputNumber;
    }
}
