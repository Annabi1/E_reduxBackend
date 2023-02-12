package com.insy2s.E_REDUX.Services;

import java.util.List;
import java.util.Optional;

import com.insy2s.E_REDUX.Entites.Category;
import com.insy2s.E_REDUX.Entites.Product;

public interface ICategoryService {
	public List<Category> findAll();
	public Category save(Category product);
	public void delete(Integer id);
	public Optional<Category> getCategoryById(Integer id);
    public Category updateCategory(Category category);

}
