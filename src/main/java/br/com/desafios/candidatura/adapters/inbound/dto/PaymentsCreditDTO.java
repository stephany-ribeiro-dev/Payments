package br.com.desafios.candidatura.adapters.inbound.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

@Data
public class PaymentsCreditDTO {

    @NotNull(message = "payer is required")
    private String payer;

    @NotNull(message = "payee is required")
    private String payee;

    @Min(1)
    private double amount;

    @NotNull(message = "date is required")
    private Date date;

    @NotNull(message = "cvv is required")
    private String cvv;

    @NotNull(message = "cardNumber is required")
    private String cardNumber;

    @NotNull(message = "expirationDate is required")
    private String expirationDate;
}