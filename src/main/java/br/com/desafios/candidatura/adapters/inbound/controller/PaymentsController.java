package br.com.desafios.candidatura.adapters.inbound.controller;

import br.com.desafios.candidatura.adapters.inbound.dto.PaymentsCreditDTO;
import br.com.desafios.candidatura.application.usecases.PaymentsCreditUseCases;
import br.com.desafios.candidatura.domain.paymentcredit.PaymentsCredit;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


    @RestController
    @RequiredArgsConstructor
    @RequestMapping("/payments")
    public class PaymentsController {

        private final PaymentsCreditUseCases creditUseCases;

//        @PostMapping("/debits")
//        @ResponseStatus(HttpStatus.OK)
//        public PaymentsDebit debitCard(@RequestBody PaymentsDebitDTO paymentsDebitDTO) {
//            creditUseCases.debitCard(paymentsDebitDTO);
//        }

        @PostMapping("/credits")
        @ResponseStatus(HttpStatus.OK)
        public PaymentsCredit creditCard(@RequestBody @Valid PaymentsCreditDTO paymentCreditDTO) {
            return creditUseCases.creditCard(paymentCreditDTO);
        }

    }


