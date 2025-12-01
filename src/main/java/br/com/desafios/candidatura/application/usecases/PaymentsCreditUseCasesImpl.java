package br.com.desafios.candidatura.application.usecases;

import br.com.desafios.candidatura.adapters.inbound.dto.PaymentsCreditDTO;
import br.com.desafios.candidatura.domain.paymentcredit.PaymentsCredit;
import br.com.desafios.candidatura.domain.paymentcredit.PaymentsCreditRepository;
import br.com.desafios.candidatura.utils.mappers.PaymentCreditMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentsCreditUseCasesImpl implements PaymentsCreditUseCases{

    private final PaymentsCreditRepository creditRepository;

    private final PaymentCreditMapper mapper;

    //Criar use case de debito
//    public void debitCard(PaymentsDebitDTO paymentsDebitDTO){
//        System.out.println("Processando cartao de debito...");
//        if( !validateDebitCard(paymentsDebitDTO)) {
//            System.out.println("Falha na validacao do cartao de debito.");
//            return;
//        }
//        processDebitCardPayment();
//    }

    public PaymentsCredit creditCard(PaymentsCreditDTO paymentsCreditDTO){
        return creditRepository.save(
                mapper.paymentsCreditDTOToPaymentsCredit(paymentsCreditDTO)
        );
    }
}
