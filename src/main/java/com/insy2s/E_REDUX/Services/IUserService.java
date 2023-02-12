package com.insy2s.E_REDUX.Services;

import java.util.List;
import java.util.Optional;

import com.insy2s.E_REDUX.Entites.Product;
import com.insy2s.E_REDUX.Entites.Userr;

public interface IUserService {
	public Userr registerNewUser(Userr user);
	public List<Userr> findAll();
	public Product save(Userr user);
	public void delete(String username);
	public Optional<Product> getUserrUserName(String username);
    public Product updateUser(Userr userr);

}
