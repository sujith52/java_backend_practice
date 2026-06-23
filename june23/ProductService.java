package com.sujith.SimpleApp.service;

import com.sujith.SimpleApp.model.Product;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101,"Iphone",50000),
            new Product(102,"GooglePixel",30000)));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductByid(int prodId) {
        return products.stream()
                .filter(p -> p.getProId() == prodId)
                .findFirst().orElse(new Product(100,"Item not Found",0));
    }

    public void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index =0;
        for (int i=0;i<products.size();i++)
            if (products.get(i).getProId() == prod.getProId())
                index = i;

        products.set(index,prod);
    }

    public void deleteProduct(int proId) {
        int index =0;
        for (int i=0;i<products.size();i++)
            if (products.get(i).getProId() == proId)
                index = i;

        products.remove(index);
    }
}
