package tn.esprit.foyersae.services;

import tn.esprit.foyersae.entite.Universite;
import tn.esprit.foyersae.repositories.UniversiteRepository;

import java.util.List;

public class UniversiteServiceImpl implements  IUniversiteService{

    UniversiteRepository universiteRepository;
    @Override
    public Universite addUniveriste(Universite universite) {
        return  universiteRepository.save(universite);
    }

    @Override
    public void deleteUniversite(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);

    }

    @Override
    public List<Universite> getAllUniveriste() {
        return null;
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }
}
