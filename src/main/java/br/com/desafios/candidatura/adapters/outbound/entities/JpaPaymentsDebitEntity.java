package br.com.desafios.candidatura.adapters.outbound.entities;

import br.com.desafios.candidatura.domain.paymentdebit.PaymentsDebit;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name= "tb_debit_card")
public class JpaPaymentsDebitEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
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
    private String accountNumber;

    @NotNull
    private String bankCode;
    
    public JpaPaymentsDebitEntity(PaymentsDebit paymentsDebit){
        this.id = paymentsDebit.getId();
        this.payer = paymentsDebit.getPayer();
        this.payee = paymentsDebit.getPayee();
        this.amount = paymentsDebit.getAmount();
        this.date = paymentsDebit.getDate();
        this.accountNumber = paymentsDebit.getAccountNumber();
        this.bankCode = paymentsDebit.getBankCode();
    }
}
