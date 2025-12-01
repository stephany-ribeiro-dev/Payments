package br.com.desafios.candidatura.application.usecases;

import br.com.desafios.candidatura.adapters.inbound.dto.PaymentsDebitDTO;
import br.com.desafios.candidatura.domain.paymentdebit.PaymentsDebit;
import br.com.desafios.candidatura.domain.paymentdebit.PaymentsDebitRepository;
import br.com.desafios.candidatura.utils.mappers.PaymentDebitMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentsDebitUseCasesImpl implements PaymentsDebitUseCases{

    private final PaymentsDebitRepository debitRepository;

    private final PaymentDebitMapper mapper;

    public PaymentsDebit debitCard (PaymentsDebitDTO paymentsDebitDTO){
        return debitRepository.save (
                mapper.paymentsDebitDTOToPaymentsDebit(paymentsDebitDTO)
        );
    }
}
