package com.insy2s.E_REDUX.Entites;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Panier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int panierId;
	private String imageProduct;
	private String reference;
	private int qty;
	private double price;
	/*
	 * @OneToMany(mappedBy="panier") private Set<Product> products;
	 */
}
