package tn.esprit.foyersae.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyersae.entite.Bloc;

@Repository

public interface BlocRepository extends JpaRepository<Bloc,Long> {
}
