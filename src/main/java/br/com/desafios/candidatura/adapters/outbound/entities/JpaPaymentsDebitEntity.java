package br.com.desafios.candidatura.adapters.outbound.entities;

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
}
