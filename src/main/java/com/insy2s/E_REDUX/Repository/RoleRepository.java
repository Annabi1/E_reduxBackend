package com.insy2s.E_REDUX.Repository;

import com.insy2s.E_REDUX.Entites.Panier;
import com.insy2s.E_REDUX.Entites.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Panier, Integer> {

    Optional<Role> findRoleByName(String name);
}
