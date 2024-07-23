package com.dawissem.bank.Controller;

import com.dawissem.bank.LoginResponse;
import com.dawissem.bank.Repository.UserRepo;
import com.dawissem.bank.Service.UserService;
import com.dawissem.bank.dto.LoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping(path = "/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse loginResponse = userService.loginUser(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }

}