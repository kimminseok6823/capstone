package capstone.capstone.domain.profile.repository;


import capstone.capstone.domain.profile.entity.Technic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnicJpaRepository extends JpaRepository<Technic, String> {
    Boolean existsByTechnicName(String technicName);
}
