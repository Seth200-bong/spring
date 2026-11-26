package kh.edu.istad.b02restapi.repository;

import kh.edu.istad.b02restapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer > {
}
