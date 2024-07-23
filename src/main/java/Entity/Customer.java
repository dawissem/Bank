package Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "CUSTOMER_ID", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "CUSTOMER_TYPE", nullable = false)
    private String customerType;

    @Column(name = "SHORT_NAME", length = 60)
    private String shortName;

    @Lob
    @Column(name = "GENDER")
    private String gender;

    @Column(name = "DATE_BIRTH_CREATION")
    private LocalDate dateBirthCreation;

    @Column(name = "ADDRESS", length = 60)
    private String address;

    @Column(name = "POST_CODE")
    private Integer postCode;

    @Lob
    @Column(name = "LEGAL_DOC_NAME", nullable = false)
    private String legalDocName;

    @Column(name = "LEGAL_ID", length = 30)
    private String legalId;

    @Column(name = "NATIONALITY", length = 2)
    private String nationality;

    @Column(name = "ACCOUNT_OFFICER")
    private Integer accountOfficer;

    @Column(name = "TEL", length = 20)
    private String tel;

    @Column(name = "MAIL", length = 30)
    private String mail;

}