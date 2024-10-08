package tn.esprit.foyersae.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyersae.entite.Etudiant;
@Repository

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
