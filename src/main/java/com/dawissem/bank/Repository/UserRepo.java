package com.dawissem.bank.Repository;

import Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository

 public interface UserRepo extends JpaRepository<User,Integer>
{
      Optional<User> findOneByMatriculeAndPassword(Integer matricule, String password) ;


        User findByMatricule(Integer matricule);

}