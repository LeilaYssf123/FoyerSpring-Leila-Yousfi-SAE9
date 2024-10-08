package tn.esprit.foyersae.services;

import tn.esprit.foyersae.entite.Bloc;
import tn.esprit.foyersae.entite.Reservation;

import java.util.List;

public interface IReservationService {

    Reservation addReservation (Reservation reservation);
    void deleteReservation(Long idReservation);
    List<Reservation> getAllReservation ();
   Reservation updateReservation (Reservation reservation);
}
