package br.com.desafios.candidatura.application.service;

import br.com.desafios.candidatura.adapters.inbound.dto.PaymentCreditDTO;
import br.com.desafios.candidatura.adapters.inbound.dto.PaymentDebitDTO;
import org.springframework.stereotype.Service;

@Service
public class PaymentsService {

    public void debitCard(PaymentDebitDTO paymentDebitDTO){
        System.out.println("Processando cartao de debito...");
        if( !validateDebitCard(paymentDebitDTO)) {
            System.out.println("Falha na validacao do cartao de debito.");
            return;
        }
        processDebitCardPayment();
    }

    public void creditCard(PaymentCreditDTO paymentCreditDTO){
        System.out.println("Processando cartao de credito...");
        if (!validateCreditCard(paymentCreditDTO)) {
            System.out.println("Falha na validacao do cartao de credito.");
            return;
        }
        processCreditCardPayment();
    }

    private boolean validateDebitCard(PaymentDebitDTO paymentDebitDTO){
        if (paymentDebitDTO.getAccountNumber() == null || paymentDebitDTO.getBankCode() == null) {
            System.out.println("Dados do cartao incompletos.");
            return false;
        }
        return true;
    }

    private boolean validateCreditCard(PaymentCreditDTO paymentCreditDTO){
        if (paymentCreditDTO.getCardNumber() == null || paymentCreditDTO.getExpirationDate() == null
                || paymentCreditDTO.getCVV() == null) {
            System.out.println("Dados do cartao incompletos.");
            return false;
        }
        return true;
    }

    private void processDebitCardPayment() {
        System.out.println("Processando pagamento com cartao de debito...");
    }

    private void processCreditCardPayment() {
        System.out.println("Processando pagamento com cartao de credito...");
    }

}
