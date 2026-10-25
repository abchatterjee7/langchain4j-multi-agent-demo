package org.aadi.repository;

import org.aadi.model.RefundPolicy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RefundPolicyRepository
        extends JpaRepository<org.aadi.model.RefundPolicy, Long> {

    Optional<RefundPolicy> findByOrderStatus(
            String orderStatus
    );
}