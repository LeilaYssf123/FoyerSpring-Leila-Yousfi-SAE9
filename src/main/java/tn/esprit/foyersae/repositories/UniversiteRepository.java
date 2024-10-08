package tn.esprit.foyersae.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyersae.entite.Universite;
@Repository

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
}
