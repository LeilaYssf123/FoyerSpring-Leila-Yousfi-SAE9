package tn.esprit.foyersae.Controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.foyersae.entite.Bloc;
import tn.esprit.foyersae.entite.Chambre;
import tn.esprit.foyersae.services.IBlocService;
import tn.esprit.foyersae.services.IChambreService;

import java.util.List;

public class BlocController {

    IBlocService iBlocService;

    @GetMapping("/get-all-Bloc")
    public List<Bloc> getBloc() {
        List<Bloc> listBloc = iBlocService.getAllBloc();
        return listBloc;
    }


    @PostMapping("/add-Bloc")
    public Bloc addBloc(@RequestBody Bloc b) {
        Bloc bloc = iBlocService.addBloc(b);
        return bloc;
    }

    @DeleteMapping("/delete-bloc/{bloc-id}")
    public void deleteBloc(@PathVariable("bloc-id") Long IdBloc) {
        iBlocService.deleteBloc(IdBloc);
    }
    @PutMapping("/update-bloc")
    public Bloc updateBloc(@RequestBody Bloc b) {
        Bloc bloc = iBlocService.updateBloc(b);
        return bloc;
    }}
