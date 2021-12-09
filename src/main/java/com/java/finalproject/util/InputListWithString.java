package com.java.finalproject.util;

public class InputListWithString {
    private String start;
    private String destination;
    private int price;

    public InputListWithString(){
        start = "";
        destination = "";
        price = 0;
    }

    public String getStart() {
        return start;
    }

    public String getDestination() {
        return destination;
    }

    public int getPrice() {
        return Integer.valueOf(price) ;
    }

    @Override
    public String toString() {
        return "start: " + start + ", destination: " + destination + " price: " + price;
    }
}
