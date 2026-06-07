package com.example.DeleteDemo.Service;

import com.example.DeleteDemo.Entites.Product;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ProductService {
    private HashMap<Integer, Product> productMap = new HashMap<>();

    @PostConstruct
    public void loadProducts() {
        productMap.put(1, new Product(1, "Laptop", 500));
        productMap.put(2, new Product(2, "Phone", 300));
        productMap.put(3, new Product(3, "Tablet", 200));
    }


    public String deleteProductById(int productId){
        if (!productMap.containsKey(productId)) {
            return "Product not found";
        }

        Product productToRemove = productMap.remove(productId);

        return "Product Deleted Successfully\n" +
                "Product ID: " + productToRemove.getProductId() +
                "\nProduct Name: " + productToRemove.getProductName() +
                "\nProduct Price: " + productToRemove.getPrice();
    }
}
