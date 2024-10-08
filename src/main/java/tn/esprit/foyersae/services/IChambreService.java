package tn.esprit.foyersae.services;

import tn.esprit.foyersae.entite.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addChambre ( Chambre chambre);
    void deleteChambre(Long idChambre);
     List<Chambre> getAllChambre ();
     Chambre updateChambre (Chambre chambre);
}
