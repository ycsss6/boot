package org.example.repository;

import org.example.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.math.BigDecimal;

@SpringBootTest
public class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;
    @Test
    public void testFindTop10() {
        Page<Product> productPage=productRepository.findAll(PageRequest.of(0, 10));
        System.err.println(productPage.getContent());
    }
    @Test
    public void testDeleteById(){
        productRepository.deleteById(10000);
    }
    @Test
    public void testAddProduct() {
        Product product = new Product();
        product.setCategoryId(1);
        product.setName("商品");
        product.setSubtitle("商品");
        product.setMainImage("test.jpg");
        product.setSubImages("test1.jpg,test2.jpg");
        product.setDetail("详细信息");
        product.setPrice(new BigDecimal(1000));
        product.setStock(10);
        product.setStatus(1);
        productRepository.save(product);
    }
    @Test
    public void testUpdateProduct() {
        Product product = new Product();
        product.setId(9524);
        product.setCategoryId(1);
        product.setName("商品");
        product.setSubtitle("商品");
        product.setMainImage("test.jpg");
        product.setSubImages("test1.jpg,test2.jpg");
        product.setDetail("详细信息");
        product.setPrice(new BigDecimal(10000));
        product.setStock(100);
        product.setStatus(1);
        productRepository.save(product);
    }
}
