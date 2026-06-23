package com.sujith.SimpleApp.model;


import org.springframework.stereotype.Component;


@Component
public class Product {
    private int proId;
    private String proName;
    private int price;

    public Product(){

    }
    public Product(int proId, String proName, int price) {
        this.proId = proId;
        this.proName = proName;
        this.price = price;
    }

    public int getProId() {
        return proId;
    }

    public String getProName() {
        return proName;
    }

    public int getPrice() {
        return price;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
