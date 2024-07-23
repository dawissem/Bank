package Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter

@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "matricule", nullable = false)

    private Integer matricule;


    @Column(name = "Nom", length = 20)
    private String nom;

    @Column(name = "Prenom", length = 20)
    private String prenom;

    @Column(name = "Agence")
    private Integer agence;

    @Column(name = "Mail", length = 30)
    private String mail;

    @Column(name = "password", length = 12)
    private String password;

    public User() {

    }



    public User(String matricule, String nom, String prenom, Integer agence, String mail, String motDePasse) {
        this.matricule = Integer.valueOf(matricule);
        this.nom = nom;
        this.prenom = prenom;
        this.agence = agence;
        this.mail = mail;
        this.password = motDePasse;
    }
}