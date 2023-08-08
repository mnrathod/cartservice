package demo.cart.domain;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class CartItem extends Item {
	
	private int qty;
	private float price;

}
