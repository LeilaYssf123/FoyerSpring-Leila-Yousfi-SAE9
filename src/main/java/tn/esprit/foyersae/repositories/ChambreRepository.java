package tn.esprit.foyersae.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyersae.entite.Chambre;


@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
