package com.example.ecommerce; // Replace with your actual package name
 
import com.example.ecommerce.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
 
public interface ProductRepository extends JpaRepository<Product, Long> {
    
    // Additional custom methods
    
    // Find products by name
    List<Product> findByName(String name);
    
    // Find products by price less than the specified value
    List<Product> findByPriceLessThan(Double price);
    
    // Find products by stock greater than the specified value
    List<Product> findByStockGreaterThan(Integer stock);
    
}