package br.com.desafios.candidatura.controller;

import br.com.desafios.candidatura.dto.PaymentCreditDTO;
import br.com.desafios.candidatura.dto.PaymentDebitDTO;
import br.com.desafios.candidatura.service.PaymentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequiredArgsConstructor
    @RequestMapping("/payments")
    public class PaymentsController {

        private final PaymentsService paymentsServices;

        @PostMapping("/debits")
        @ResponseStatus(HttpStatus.OK)
        public void debitCard(PaymentDebitDTO paymentDebitDTO) {
            paymentsServices.debitCard(paymentDebitDTO);
        }

        @PostMapping("/credits")
        @ResponseStatus(HttpStatus.OK)
        public void creditCard(PaymentCreditDTO paymentCreditDTO) {
            paymentsServices.creditCard(paymentCreditDTO);
        }

    }


