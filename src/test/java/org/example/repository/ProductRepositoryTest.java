package org.example.repository;

import org.example.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Optional;

@SpringBootTest
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;
    @Test
    public void Test () {
//        Optional<Product> optionalProduct = productRepository.findById(10);
//        System.out.println(optionalProduct.get());
//           Product product = new Product();
//           product.setStock(100);
//           product.setPrice(BigDecimal.valueOf(10000));

    }

}
