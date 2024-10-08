package tn.esprit.foyersae.Controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.foyersae.entite.Etudiant;
import tn.esprit.foyersae.entite.Reservation;
import tn.esprit.foyersae.services.IEtudiantService;
import tn.esprit.foyersae.services.IReservationService;

import java.util.List;

public class ReservationController {

    IReservationService iReservationService;

    @GetMapping("/get-all-Reservation")
    public List<Reservation> getReservation() {
        List<Reservation> listReservation = iReservationService.getAllReservation();
        return listReservation;
    }


    @PostMapping("/add-Reservation")
    public Reservation addReservation(@RequestBody Reservation r) {
        Reservation reservation= iReservationService.addReservation(r);
        return reservation;
    }

    @DeleteMapping("/delete-reservation/{reservation-id}")
    public void deleteReservation(@PathVariable("reservation-id") Long IdReservationt) {
        iReservationService.deleteReservation(IdReservationt);
    }
    @PutMapping("/update-reservation")
    public Reservation updateReservation(@RequestBody Reservation r) {
        Reservation reservation= iReservationService.updateReservation(r);
        return reservation;
    }}

