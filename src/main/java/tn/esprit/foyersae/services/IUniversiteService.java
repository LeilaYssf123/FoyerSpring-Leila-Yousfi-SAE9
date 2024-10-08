package tn.esprit.foyersae.services;

import tn.esprit.foyersae.entite.Bloc;
import tn.esprit.foyersae.entite.Universite;

import java.util.List;

public interface IUniversiteService {

    Universite addUniveriste (Universite universite);
    void deleteUniversite(Long idUniversite);
    List<Universite> getAllUniveriste ();
    Universite updateUniversite (Universite universite);
}
