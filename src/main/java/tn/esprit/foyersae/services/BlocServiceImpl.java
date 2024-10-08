package tn.esprit.foyersae.services;

import tn.esprit.foyersae.entite.Bloc;
import tn.esprit.foyersae.repositories.BlocRepository;

import java.util.List;

public class BlocServiceImpl implements  IBlocService{

    BlocRepository blocRepository;
    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void deleteBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);

    }

    @Override
    public List<Bloc> getAllBloc() {
        return null;
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }
}
