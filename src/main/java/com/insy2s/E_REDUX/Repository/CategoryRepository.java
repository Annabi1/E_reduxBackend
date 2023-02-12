package com.insy2s.E_REDUX.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insy2s.E_REDUX.Entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
