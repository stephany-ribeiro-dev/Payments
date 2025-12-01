package br.com.desafios.candidatura.adapters.inbound.controller;

import br.com.desafios.candidatura.adapters.inbound.dto.PaymentsCreditDTO;
import br.com.desafios.candidatura.adapters.inbound.dto.PaymentsDebitDTO;
import br.com.desafios.candidatura.application.usecases.PaymentsCreditUseCases;
import br.com.desafios.candidatura.application.usecases.PaymentsDebitUseCases;
import br.com.desafios.candidatura.domain.paymentcredit.PaymentsCredit;
import br.com.desafios.candidatura.domain.paymentdebit.PaymentsDebit;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


    @RestController
    @RequiredArgsConstructor
    @RequestMapping("/payments")
    public class PaymentsController {

        private final PaymentsCreditUseCases creditUseCases;

        private final PaymentsDebitUseCases debitUseCases;

        @PostMapping("/debits")
        @ResponseStatus(HttpStatus.CREATED)
        public PaymentsDebit debitCard(@RequestBody @Valid PaymentsDebitDTO paymentsDebitDTO) {
             return debitUseCases.debitCard(paymentsDebitDTO);
        }

        @PostMapping("/credits")
        @ResponseStatus(HttpStatus.CREATED)
        public PaymentsCredit creditCard(@RequestBody @Valid PaymentsCreditDTO paymentCreditDTO) {
            return creditUseCases.creditCard(paymentCreditDTO);
        }

    }


