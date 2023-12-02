package com.example.ecommerce;
 
import com.example.ecommerce.Cart;
import com.example.ecommerce.Order;
import com.example.ecommerce.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
 
@Service
public class OrderService {
 
    @Autowired
    private OrderRepository orderRepository;
 
    @Autowired
    private CartService cartService;
 
    // Operations to place an order and view order history
 
    public void placeOrder(Long cartId) {
        Cart cart = cartService.getCartById(cartId);
        if (cart != null && !cart.getProducts().isEmpty()) {
            Order order = new Order();
            order.setProducts(cart.getProducts());
            orderRepository.save(order);
 
            // Optional: Clear the products from the cart after placing the order
            cart.getProducts().clear();
            cartService.saveCart(cart);
        }
    }
 
    public List<Order> viewOrderHistory() {
        return orderRepository.findAll();
    }
}