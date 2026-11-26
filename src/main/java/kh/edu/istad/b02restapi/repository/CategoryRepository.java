package kh.edu.istad.b02restapi.repository;

import kh.edu.istad.b02restapi.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
