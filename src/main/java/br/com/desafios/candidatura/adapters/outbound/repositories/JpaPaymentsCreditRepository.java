package br.com.desafios.candidatura.adapters.outbound.repositories;

import br.com.desafios.candidatura.adapters.outbound.entities.JpaPaymentsCreditEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaPaymentsCreditRepository extends JpaRepository<JpaPaymentsCreditEntity, Long> {
}
