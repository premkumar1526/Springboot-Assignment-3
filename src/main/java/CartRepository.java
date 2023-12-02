package com.example.ecommerce;
 
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
 
public interface CartRepository extends JpaRepository<Cart, Long> {
    
    // Additional custom methods
    
    // Find cart by ID and fetch associated products
    Optional<Cart> findByIdAndFetchProducts(Long id);
    
    // Find cart by product ID
    Optional<Cart> findByProducts_Id(Long productId);
    
}