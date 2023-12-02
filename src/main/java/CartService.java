package com.example.ecommerce;
 
import com.example.ecommerce.Cart;
import com.example.ecommerce.Product;
import com.example.ecommerce.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
 
@Service
public class CartService {
 
    @Autowired
    private CartRepository cartRepository;
 
    @Autowired
    private ProductService productService;
 
    // Operations for managing products in the cart
 
    public void addProductToCart(Long cartId, Long productId) {
        Optional<Cart> optionalCart = cartRepository.findById(cartId);
        if (optionalCart.isPresent()) {
            Optional<Product> optionalProduct = productService.getProductById(productId);
            optionalProduct.ifPresent(product -> {
                Cart cart = optionalCart.get();
                cart.getProducts().add(product);
                cartRepository.save(cart);
            });
        }
    }
 
    public void removeProductFromCart(Long cartId, Long productId) {
        Optional<Cart> optionalCart = cartRepository.findById(cartId);
        if (optionalCart.isPresent()) {
            Cart cart = optionalCart.get();
            cart.getProducts().removeIf(product -> product.getId().equals(productId));
            cartRepository.save(cart);
        }
    }
 
    public void viewCart(Long cartId) {
        Optional<Cart> optionalCart = cartRepository.findById(cartId);
        if (optionalCart.isPresent()) {
            Cart cart = optionalCart.get();
            System.out.println("Products in Cart:");
            for (Product product : cart.getProducts()) {
                System.out.println("ID: " + product.getId() + ", Name: " + product.getName() +
                        ", Price: " + product.getPrice());
            }
        }
    }

	public Cart getCartById(Long cartId) {
		
		return null;
	}

	public void saveCart(Cart cart) {
		
	}

	public char getProducts() {
		System.out.println("Products in Cart:");
		return getProducts();
	}

	 
}