package demo.cart.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import demo.cart.domain.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
    List<Customer> findByName(String name);
}
