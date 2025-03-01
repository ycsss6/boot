package org.example.repository;

import org.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    //条件查询 findBy实体类里的属性名首字母大写
    List<Product> findByPrice(BigDecimal price);
}
