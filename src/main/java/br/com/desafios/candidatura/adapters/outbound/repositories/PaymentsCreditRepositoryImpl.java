package br.com.desafios.candidatura.adapters.outbound.repositories;

import br.com.desafios.candidatura.adapters.outbound.entities.JpaPaymentsCreditEntity;
import br.com.desafios.candidatura.domain.paymentcredit.PaymentsCredit;
import br.com.desafios.candidatura.domain.paymentcredit.PaymentsCreditRepository;
import br.com.desafios.candidatura.utils.mappers.PaymentCreditMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentsCreditRepositoryImpl implements PaymentsCreditRepository {

    private final JpaPaymentsCreditRepository jpaPaymentsCreditRepository;

    private final PaymentCreditMapper mapper;

    @Override
    public PaymentsCredit save(PaymentsCredit paymentsCredit) {

        JpaPaymentsCreditEntity jpaPaymentsCreditEntity = new JpaPaymentsCreditEntity(paymentsCredit);

        JpaPaymentsCreditEntity jpaPaymentsCredit = this.jpaPaymentsCreditRepository.save(jpaPaymentsCreditEntity);

        return mapper.jpaPaymentsCreditToPaymentsCredit(jpaPaymentsCredit);
    }
}
