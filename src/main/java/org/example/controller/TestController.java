package org.example.controller;
import java.util.List;
import org.example.entity.Product;
import org.example.mapper.ProductMapper;
import org.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/listAll")
    public List<Product> listAll(){
        return productMapper.listAll();
    }

    @GetMapping("/test")
    public String test() {
            productRepository. findAll();
            return "success";

    }
}
