package com.insy2s.E_REDUX.Entites;

import java.beans.Transient;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;



@Data
@Entity
public class Product {

	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String name;
  
    private double price;
    private String image;
    @ManyToOne(optional = false)
	 @JoinColumn(name="category_id") private Category category;
    
	/*
	 *
	 * 
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="panier_id", nullable=false) private Panier panier;
	 */
    @Transient
    public String getPhotosImagePath() {
        if (image == null || productId == 0) return null;
         
        return "/products-photos/" + productId + "/" + image;
    }
    
}
