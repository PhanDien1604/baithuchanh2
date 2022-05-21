package productMaintenance.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import productMaintenance.model.Product;

public interface ProductRepository extends CrudRepository<Product, String>{
	
	@Query("SELECT * FROM product WHERE product.code = $1")
	Product findByCode(String code);
	
	@Query("DELETE FROM product WHERE product.code = '$1'")
	void deleteByCode(String code);
}
