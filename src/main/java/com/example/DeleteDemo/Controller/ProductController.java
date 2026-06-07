package com.example.DeleteDemo.Controller;

import com.example.DeleteDemo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


    //ProductService productService = new ProductService();
    @Autowired
    private ProductService productService;


    @DeleteMapping("/products/{productId}")
    public String deleteProduct(@PathVariable int productId){
        return productService.deleteProductById(productId);
    }
}
