package br.com.desafios.candidatura.application.usecases;

import br.com.desafios.candidatura.adapters.inbound.dto.PaymentsDebitDTO;
import br.com.desafios.candidatura.domain.paymentdebit.PaymentsDebit;

public interface PaymentsDebitUseCases {
    PaymentsDebit debitCard(PaymentsDebitDTO paymentsDebitDTO);
}
