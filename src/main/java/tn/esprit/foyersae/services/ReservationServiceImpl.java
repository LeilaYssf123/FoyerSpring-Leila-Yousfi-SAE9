package tn.esprit.foyersae.services;

import tn.esprit.foyersae.entite.Reservation;
import tn.esprit.foyersae.repositories.ReservationRepository;

import java.util.List;

public class ReservationServiceImpl implements  IReservationService{

    ReservationRepository reservationRepository;
    @Override
    public Reservation addReservation(Reservation reservation) {
        return  reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(Long idReservation) {
        reservationRepository.deleteById(String.valueOf(idReservation));

    }

    @Override
    public List<Reservation> getAllReservation() {
        return null;
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return  reservationRepository.save(reservation);
    }
}
