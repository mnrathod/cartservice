package demo.cart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import demo.cart.dao.CartRepository;
import demo.cart.domain.CartItem;

@Service
public class CartService {
	
	@Autowired
	CartRepository cartRepository;
	
	@Transactional
	public List<CartItem> findByName(String name) {
		return cartRepository.findByName(name);
	}
	
	@Transactional
	public CartItem getById(Integer id) {
		return cartRepository.findById(id).get();
	}
	
	@Transactional
	public boolean addCartItem(CartItem cartItem) {
		return cartRepository.save(cartItem)  != null;
	}

	@Transactional
	public boolean updateCartItem(CartItem cartItem) {
		return cartRepository.save(cartItem)  != null;
	}

	@Transactional
	public List<CartItem> getAllCartItems() {
		return (List<CartItem>) cartRepository.findAll();
	}

}
