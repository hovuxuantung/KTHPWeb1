package com.example.beststore.beststore.controllers;


import com.example.beststore.beststore.models.Product;
import com.example.beststore.beststore.services.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@Controller
@RequestMapping("/")
public class ProductsController {
    @Autowired
    private ProductsRepository repo;

    @GetMapping({ "/" })
    public String ShowProductList(Model model) {
        List<Product> products = repo.findAll();
        model.addAttribute("products", products);
        return "products/index";
    }

    @GetMapping("/product")
    public String productShowProducts(Model model) {
        List<Product> products = repo.findAll();
        model.addAttribute("products", products);
        return "products/product";
    }

    @GetMapping("/cart")
    public String cartShowProducts(Model model) {
        List<Product> products = repo.findAll();
        model.addAttribute("products", products);
        return "products/cart";
    }
    @GetMapping("/login")
    public String loginShowProducts(Model model) {
        List<Product> products = repo.findAll();
        model.addAttribute("products", products);
        return "products/login";
    }
    @GetMapping("/register")
    public String registerShowProducts(Model model) {
        List<Product> products = repo.findAll();
        model.addAttribute("products", products);
        return "products/register";
    }
}


