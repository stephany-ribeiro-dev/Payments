package br.com.desafios.candidatura.application.usecases;

import br.com.desafios.candidatura.adapters.inbound.dto.PaymentsCreditDTO;
import br.com.desafios.candidatura.domain.paymentcredit.PaymentsCredit;

public interface PaymentsCreditUseCases {
    PaymentsCredit creditCard(PaymentsCreditDTO paymentsCreditDTO);
}
