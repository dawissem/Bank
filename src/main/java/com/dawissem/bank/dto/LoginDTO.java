package com.dawissem.bank.dto;

public class LoginDTO {
    Integer matricule;
    String password;


    public LoginDTO() {

    }

    public Integer getMatricule() {
        return matricule;
    }

    public void setMatricule(Integer matricule) {
        matricule = matricule;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginDTO(Integer matricule, String password) {
        matricule = matricule;
        this.password = password;
    }
}