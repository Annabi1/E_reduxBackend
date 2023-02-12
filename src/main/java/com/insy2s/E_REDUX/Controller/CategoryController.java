package com.insy2s.E_REDUX.Controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.insy2s.E_REDUX.Entites.Category;
import com.insy2s.E_REDUX.Entites.Product;
import com.insy2s.E_REDUX.Services.CategoryServiceImpl;

@RestController
@RequestMapping("/api/category")
//open for all ports
@CrossOrigin(origins = "*")
public class CategoryController {
	 private final Logger log = LoggerFactory.getLogger(Product.class);


		@Autowired
		private CategoryServiceImpl categoryServiceImpl;
		@GetMapping("/")
		   public List<Category> getAllCategory( )  {
		        log.debug("REST request to get all  Category : {}");
		           return categoryServiceImpl.findAll();
		    }
		@GetMapping("/products/{id}")
		   public List<Product> getAllProducOfCategory( @PathVariable Integer id)  {
		        log.debug("REST request to get all  Category : {}");
		           return categoryServiceImpl.findAllProduct(id);
		    }
		@PostMapping("/")
		   public ResponseEntity<Category> createCategory( @RequestBody Category category) throws URISyntaxException {
		        log.debug("REST request to save category : {}", category);
		        
		        Category result = categoryServiceImpl.save(category);
		        return ResponseEntity.status(201)
		                .body(result);
		    }
		@GetMapping("/categoryId/{id}")
		   public ResponseEntity<Category> getCategoryById( @PathVariable Integer id) throws URISyntaxException {
		        log.debug("REST request to find category by id : {}", id);
		        
		        Optional<Category> result = categoryServiceImpl.getCategoryById(id);
		        return ResponseEntity.status(200)
		                .body(result.get());
		    }
}
