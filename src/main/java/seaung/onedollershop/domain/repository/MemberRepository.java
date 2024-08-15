package seaung.onedollershop.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import seaung.onedollershop.domain.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
