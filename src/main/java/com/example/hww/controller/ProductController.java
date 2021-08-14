package com.example.hww.controller;
import com.example.hww.repository.DataBaseRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")

public class ProductController {

    private DataBaseRepository dataBaseRepository;

    public ProductController(DataBaseRepository dataBaseRepository){
        this.dataBaseRepository = dataBaseRepository;
    }

    @GetMapping("/fetch-product")
    public String fetchProduct(@RequestParam(value = "name", required = true) String name) {
        return dataBaseRepository.getProductName(name);
    }
}