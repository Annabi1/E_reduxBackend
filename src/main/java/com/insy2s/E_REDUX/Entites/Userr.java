package com.insy2s.E_REDUX.Entites;
import jakarta.persistence.*;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Userr   {

  @Id
  @Column(unique = true)
  private String userName;
  private String firstName;
  private String lastName;
  private String password;
  @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
  @JoinTable(
    name = "users_roles", 
    joinColumns = @JoinColumn(name = "user_Username"), 
    inverseJoinColumns = @JoinColumn(name = "role_Name"))
  private Set<Role>  role;

 

 
}