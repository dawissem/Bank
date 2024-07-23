package Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "account")
public class Account {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "CUSTOMER_ID")
    private Integer customerId;

    @Column(name = "ACCOUNT_OFFICER")
    private Integer accountOfficer;

    @Column(name = "ACCOUNT_TITLE", length = 60)
    private String accountTitle;

    @Column(name = "CURRENCY", length = 3)
    private String currency;

    @Column(name = "CATEGORY", length = 20)
    private String category;

    @Column(name = "WORKING_BALANCE", precision = 10, scale = 4)
    private BigDecimal workingBalance;

    @Column(name = "OPENING_DATE")
    private LocalDate openingDate;

    @Column(name = "CLOSURE_DATE")
    private LocalDate closureDate;

}