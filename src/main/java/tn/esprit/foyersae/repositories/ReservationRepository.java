package tn.esprit.foyersae.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyersae.entite.Reservation;
@Repository
public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
