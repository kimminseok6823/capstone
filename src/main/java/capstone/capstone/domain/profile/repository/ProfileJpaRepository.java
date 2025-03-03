package capstone.capstone.domain.profile.repository;


import capstone.capstone.domain.profile.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileJpaRepository extends JpaRepository<Profile, Long> {
}
