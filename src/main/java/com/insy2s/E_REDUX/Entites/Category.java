package com.insy2s.E_REDUX.Entites;

import java.util.Set;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
@Data
@Entity
public class Category {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int categoryId;
 private String name;

	
	  @OneToMany
	  private Set<Product> products;
	 
 
}
