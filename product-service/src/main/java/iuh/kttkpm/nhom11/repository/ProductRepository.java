package iuh.kttkpm.nhom11.repository;

import iuh.kttkpm.nhom11.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
