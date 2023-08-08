package demo.cart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import demo.cart.domain.Customer;

@Controller
public class AuthenticatorController {

	@PostMapping ("/authenticate")
	public String authenticate (@RequestBody Customer customer) {
		return "addcustomer";
	}

}
