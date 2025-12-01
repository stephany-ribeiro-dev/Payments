package br.com.desafios.candidatura.adapters.outbound.repositories;

import br.com.desafios.candidatura.domain.paymentdebit.PaymentsDebit;
import br.com.desafios.candidatura.domain.paymentdebit.PaymentsDebitRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PaymentsDebitRepositoryImpl implements PaymentsDebitRepository {

    private final JpaPaymentsDebitRepository jpaPaymentsDebitRepository;

    @Override
    public PaymentsDebit save(PaymentsDebit paymentsDebit) {
        return null;
    }
}
