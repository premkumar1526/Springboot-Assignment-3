package com.example.ecommerce; // Replace with your actual package name
 
import com.example.ecommerce.*;
import com.example.ecommerce.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
 
@Service
public class ProductService {
 
    @Autowired
    private ProductRepository productRepository;
 
    // CRUD operations
 
    public List<Product> listAllProducts() {
        return productRepository.findAll();
    }
 
    public Optional<Product> getProductById(Long productId) {
        return productRepository.findById(productId);
    }
 
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
 
    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
}