package com.codaconsultancy.sandbox.ocpjp;

import com.codaconsultancy.sandbox.ocpjp.food.Fruit;

public class Apple extends Fruit {
    public static void main(String[] args) {
        System.out.println(new Apple().getColour());
    }

    @Override
    public String getColour() {
        return "green and red";
    }
}
