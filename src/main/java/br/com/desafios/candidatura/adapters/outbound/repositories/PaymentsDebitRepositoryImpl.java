package br.com.desafios.candidatura.adapters.outbound.repositories;

import br.com.desafios.candidatura.adapters.outbound.entities.JpaPaymentsDebitEntity;
import br.com.desafios.candidatura.domain.paymentdebit.PaymentsDebit;
import br.com.desafios.candidatura.domain.paymentdebit.PaymentsDebitRepository;
import br.com.desafios.candidatura.utils.mappers.PaymentDebitMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentsDebitRepositoryImpl implements PaymentsDebitRepository {

    private final JpaPaymentsDebitRepository jpaPaymentsDebitRepository;

    private final PaymentDebitMapper mapper;

    @Override
    public PaymentsDebit save(PaymentsDebit paymentsDebit) {

        JpaPaymentsDebitEntity jpaPaymentsDebitEntity = new JpaPaymentsDebitEntity(paymentsDebit);

        JpaPaymentsDebitEntity jpaPaymentsDebit = this.jpaPaymentsDebitRepository.save(jpaPaymentsDebitEntity);

        return mapper.jpaPaymentsDebitToPaymentsDebit(jpaPaymentsDebit);
    }
}
