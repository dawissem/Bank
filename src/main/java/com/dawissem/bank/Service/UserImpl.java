package com.dawissem.bank.Service;

import Entity.User;
import com.dawissem.bank.LoginResponse;
import com.dawissem.bank.Repository.UserRepo;
import com.dawissem.bank.dto.LoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

 @Service
public class UserImpl implements UserService {
     @Autowired
     private UserRepo userRepo;

     @Autowired
     private PasswordEncoder passwordEncoder;



     @Override
     public LoginResponse loginUser(LoginDTO loginDTO) {
         String msg = "";
         User user1 = userRepo.findByMatricule(loginDTO.getMatricule());
         if (user1 != null) {
             String password = loginDTO.getPassword();
             String encodedPassword = user1.getPassword();
             boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
             if (isPwdRight) {
                 Optional<User> user = userRepo.findOneByMatriculeAndPassword(loginDTO.getMatricule(), encodedPassword);
                 if (user.isPresent()) {
                     return new LoginResponse("Login Success", true);
                 } else {
                     return new LoginResponse("Login Failed", false);
                 }
             } else {
                 return new LoginResponse("password Not Match", false);
             }
         } else {
             return new LoginResponse("Email not exits", false);
         }
     }


 }
