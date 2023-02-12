package com.insy2s.E_REDUX.Category;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.insy2s.E_REDUX.Entites.Category;
import com.insy2s.E_REDUX.Repository.CategoryRepository;

@DataJpaTest(showSql = true)
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class CategoryTestsRepository {
	@Autowired
	private CategoryRepository categoryRepository;
	@Test
	public void createFirstCategory()
	{ boolean isexiste=false;
	
		Category category=new Category();
		category.setName("Fruits");
		Optional<Category> categorycherch=categoryRepository.findById(category.getCategoryId());
		if (categorycherch.isEmpty())
		{
			isexiste=true;
		}
	
		Category resultcategory=categoryRepository.save(category);
		  Assertions.assertTrue(isexiste);
	}
	}
	
	


