package com.sujith.SimpleApp.contoller;


import com.sujith.SimpleApp.model.Product;
import com.sujith.SimpleApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductByid(@PathVariable int prodId){
        return service.getProductByid(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        service.addProduct(prod);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prod}")
    public void deleteProduct(@PathVariable int prod){
        service.deleteProduct(prod);
    }

}
