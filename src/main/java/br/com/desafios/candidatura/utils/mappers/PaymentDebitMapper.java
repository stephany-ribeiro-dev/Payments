package br.com.desafios.candidatura.utils.mappers;

import br.com.desafios.candidatura.adapters.inbound.dto.PaymentsDebitDTO;
import br.com.desafios.candidatura.adapters.outbound.entities.JpaPaymentsDebitEntity;

import br.com.desafios.candidatura.domain.paymentdebit.PaymentsDebit;
import org.springframework.stereotype.Component;

@Component
public class PaymentDebitMapper {
    public PaymentsDebit paymentsDebitDTOToPaymentsDebit (PaymentsDebitDTO paymentsDebitDTO){
        return new PaymentsDebit(null, paymentsDebitDTO.getPayer(), paymentsDebitDTO.getPayee(), paymentsDebitDTO.getAmount(), paymentsDebitDTO.getDate(), paymentsDebitDTO.getAccountNumber(), paymentsDebitDTO.getBankCode());
    }

    public PaymentsDebit jpaPaymentsDebitToPaymentsDebit(JpaPaymentsDebitEntity jpaPaymentsDebit) {
        return new PaymentsDebit(jpaPaymentsDebit.getId(), jpaPaymentsDebit.getPayer(), jpaPaymentsDebit.getPayee(), jpaPaymentsDebit.getAmount(), jpaPaymentsDebit.getDate(), jpaPaymentsDebit.getAccountNumber(), jpaPaymentsDebit.getBankCode());
    }
}
