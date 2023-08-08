package demo.cart.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import demo.cart.domain.CartItem;

@Repository
public interface CartRepository extends CrudRepository<CartItem, Integer>{
    List<CartItem> findByName(String name);
}
