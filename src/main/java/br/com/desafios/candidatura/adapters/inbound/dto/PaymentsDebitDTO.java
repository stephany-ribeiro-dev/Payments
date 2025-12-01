package br.com.desafios.candidatura.adapters.inbound.dto;

import lombok.Data;
import java.util.Date;

@Data
public class PaymentsDebitDTO {

    private String payer;
    private String payee;
    private double amount;
    private Date date;
    private String accountNumber;
    private String bankCode;

}
