package capstone.capstone.domain.member.repository;


import capstone.capstone.global.jwt.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorityJpaRepository extends JpaRepository<Authority, Long> {
    Optional<Authority> findByAuthority(String auth);
}
