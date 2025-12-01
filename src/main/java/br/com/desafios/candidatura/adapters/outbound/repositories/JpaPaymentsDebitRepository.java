package br.com.desafios.candidatura.adapters.outbound.repositories;

import br.com.desafios.candidatura.adapters.outbound.entities.JpaPaymentsDebitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaPaymentsDebitRepository extends JpaRepository<JpaPaymentsDebitEntity, Long> {
}
