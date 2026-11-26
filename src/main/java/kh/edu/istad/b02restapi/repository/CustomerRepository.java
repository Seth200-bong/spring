package kh.edu.istad.b02restapi.repository;

import kh.edu.istad.b02restapi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
