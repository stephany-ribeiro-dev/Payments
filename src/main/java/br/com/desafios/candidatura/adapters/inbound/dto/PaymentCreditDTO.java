package br.com.desafios.candidatura.adapters.inbound.dto;

import lombok.Data;

import java.util.Date;

@Data
public class PaymentCreditDTO {

    private String type;
    private String payer;
    private String payee;
    private double amount;
    private Date date;
    private String CVV;
    private String cardNumber;
    private String expirationDate;
}
