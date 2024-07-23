package com.dawissem.bank.Service;

import com.dawissem.bank.LoginResponse;
import com.dawissem.bank.dto.LoginDTO;

public interface UserService {


    LoginResponse loginUser(LoginDTO loginDTO);


}
