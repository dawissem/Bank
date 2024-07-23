package com.dawissem.bank.dto;

public class UserDTO {
    private int Matricule ;
    private String Nom ;
    private String Prenom ;
    private String Email ;
    private String password;


        public UserDTO(){

        }
    public UserDTO(int matricule, String nom, String prenom, String email, String password) {
        Matricule = matricule;
        Nom = nom;
        Prenom = prenom;
        Email = email;
        this.password = password;
    }
}
