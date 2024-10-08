package tn.esprit.foyersae.services;

import tn.esprit.foyersae.entite.Bloc;


import java.util.List;

public interface IBlocService {

    Bloc addBloc (Bloc bloc);
    void deleteBloc(Long idBloc);
    List<Bloc> getAllBloc ();
    Bloc updateBloc (Bloc bloc);
}
