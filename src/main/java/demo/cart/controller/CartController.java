package demo.cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import demo.cart.domain.CartItem;
import demo.cart.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	CartService cartService; 
	
	@PostMapping("/addCartItem")
	public String addCartItem (@RequestBody CartItem cartItem) {
		boolean status = cartService.addCartItem(cartItem);
		return "success";
	}

	@PostMapping("/updateCartItem")
	@ResponseBody 
	public HttpStatus updateCartItem (@RequestBody CartItem cartItem) {
		return cartService.updateCartItem(cartItem)? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/cart/{id}")
	public @ResponseBody CartItem getCartItem(@PathVariable Integer id) {
		return cartService.getById(id);
	}

	@GetMapping("/cartItemByName/{name}")
	public List<CartItem> getCartItemByName(@PathVariable String name) {
		return cartService.findByName(name);
	}

	@GetMapping(value = "/cart")
	public List<CartItem> getAll() {
		return cartService.getAllCartItems();
	}

}
