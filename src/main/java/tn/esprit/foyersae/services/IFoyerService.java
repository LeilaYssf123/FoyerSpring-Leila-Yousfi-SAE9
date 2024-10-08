package tn.esprit.foyersae.services;

import tn.esprit.foyersae.entite.Bloc;
import tn.esprit.foyersae.entite.Foyer;

import java.util.List;

public interface IFoyerService {

    Foyer addFoyer (Foyer foyer);
    void deleteFoyer(Long idFoyer);
    List<Foyer> getAllFoyer ();
    Foyer updateFoyer (Foyer foyer );
}
