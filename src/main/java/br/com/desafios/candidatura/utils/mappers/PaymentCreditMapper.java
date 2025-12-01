package br.com.desafios.candidatura.utils.mappers;

import br.com.desafios.candidatura.adapters.inbound.dto.PaymentsCreditDTO;
import br.com.desafios.candidatura.adapters.outbound.entities.JpaPaymentsCreditEntity;
import br.com.desafios.candidatura.domain.paymentcredit.PaymentsCredit;
import org.springframework.stereotype.Component;

@Component
public class PaymentCreditMapper {
    public PaymentsCredit paymentsCreditDTOToPaymentsCredit(PaymentsCreditDTO paymentsCreditDTO) {
        return new PaymentsCredit(null, paymentsCreditDTO.getPayer(),
                paymentsCreditDTO.getPayee(), paymentsCreditDTO.getAmount(), paymentsCreditDTO.getDate(),
                paymentsCreditDTO.getCvv(), paymentsCreditDTO.getCardNumber(), paymentsCreditDTO.getExpirationDate());
    }

    public PaymentsCredit jpaPaymentsCreditToPaymentsCredit(JpaPaymentsCreditEntity jpaPaymentsCredit) {
        return new PaymentsCredit(jpaPaymentsCredit.getId(), jpaPaymentsCredit.getPayer(), jpaPaymentsCredit.getPayee(), jpaPaymentsCredit.getAmount(), jpaPaymentsCredit.getDate(), jpaPaymentsCredit.getCVV(), jpaPaymentsCredit.getCardNumber(), jpaPaymentsCredit.getExpirationDate());
    }
}
