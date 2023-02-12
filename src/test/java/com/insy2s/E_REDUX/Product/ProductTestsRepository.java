package com.insy2s.E_REDUX.Product;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.insy2s.E_REDUX.Entites.*;
import com.insy2s.E_REDUX.Repository.CategoryRepository;
import com.insy2s.E_REDUX.Repository.ProductRepository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.booleanThat;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@DataJpaTest(showSql = true)
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)

public class ProductTestsRepository {
	@Autowired
	private ProductRepository repo;
	@Autowired
	private CategoryRepository categoryRepository;
	
	  @Test 
	  public void testCreateProduct() 
	  { boolean isexiste=false;
		  Optional<Category> category=categoryRepository.findById(1); 
	  Product product=new Product();
	  product.setCategory(category.get());
	  product.setName("Banene");
	  product.setPrice(4);
	  if(repo.findById(product.getProductId()).isEmpty())
	  {
		  isexiste=true;
	  }
	  Product resultProduct=repo.save(product);
	  Assertions.assertTrue(isexiste);

	  
	  }
	 
}
