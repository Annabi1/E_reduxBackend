package com.insy2s.E_REDUX.Repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insy2s.E_REDUX.Entites.Userr;

public interface UserRepository extends JpaRepository<Userr,String>{
	  Optional<Userr> findUserrByUserName(String email);

}
