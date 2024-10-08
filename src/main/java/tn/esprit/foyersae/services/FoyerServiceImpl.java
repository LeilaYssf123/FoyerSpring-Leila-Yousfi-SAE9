package tn.esprit.foyersae.services;

import tn.esprit.foyersae.entite.Foyer;
import tn.esprit.foyersae.repositories.FoyerRepository;

import java.util.List;

public class FoyerServiceImpl implements IFoyerService{

    FoyerRepository foyerRepository;
    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void deleteFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);

    }

    @Override
    public List<Foyer> getAllFoyer() {
        return null;
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }
}
