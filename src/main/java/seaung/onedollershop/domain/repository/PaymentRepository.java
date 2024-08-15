package seaung.onedollershop.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import seaung.onedollershop.domain.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
