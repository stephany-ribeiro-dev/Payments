package br.com.desafios.candidatura.adapters.inbound.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.util.Date;

@Data
public class PaymentsDebitDTO {

    @NotNull(message = "payer is required")
    private String payer;

    @NotNull(message = "payee is required")
    private String payee;

    @Min(1)
    private double amount;

    @NotNull(message = "date is required")
    private Date date;

    @NotNull(message = "accountNumber is required")
    private String accountNumber;

    @NotNull(message = "bankCode is required")
    private String bankCode;
}
