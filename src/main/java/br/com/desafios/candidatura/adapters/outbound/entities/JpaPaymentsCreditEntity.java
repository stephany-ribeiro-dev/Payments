package br.com.desafios.candidatura.adapters.outbound.entities;

import br.com.desafios.candidatura.domain.paymentcredit.PaymentsCredit;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "tb_credit_card")
public class JpaPaymentsCreditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String payer;

    @NotNull
    private String payee;

    @NotNull
    private double amount;

    @NotNull
    private Date date;

    @NotNull
    private String CVV;

    @NotNull
    private String cardNumber;

    @NotNull
    private String expirationDate;

    public JpaPaymentsCreditEntity(PaymentsCredit paymentsCredit) {
        this.id = paymentsCredit.getId();
        this.payer = paymentsCredit.getPayer();
        this.payee = paymentsCredit.getPayee();
        this.amount = paymentsCredit.getAmount();
        this.date = paymentsCredit.getDate();
        this.CVV = paymentsCredit.getCVV();
        this.cardNumber = paymentsCredit.getCardNumber();
        this.expirationDate = paymentsCredit.getExpirationDate();
    }
}
