package com.insy2s.E_REDUX.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.insy2s.E_REDUX.Entites.Product;
import com.insy2s.E_REDUX.Entites.Userr;

import jakarta.transaction.Transactional;
@Service
@Transactional

public class UserServiceImpl implements IUserService {

	@Override
	public List<Userr> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product save(Userr user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String username) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Product> getUserrUserName(String username) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Product updateUser(Userr userr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Userr registerNewUser(Userr user) {
		// TODO Auto-generated method stub
		return null;
	}

}
