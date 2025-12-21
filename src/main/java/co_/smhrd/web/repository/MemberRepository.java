package co_.smhrd.web.repository;

import co_.smhrd.web.dto.Cloud_Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Cloud_Member, Long> {
}
