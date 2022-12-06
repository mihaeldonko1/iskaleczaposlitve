package um.feri.si.isakleczaposlitve.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import um.feri.si.isakleczaposlitve.dao.OglasRepository;
import um.feri.si.isakleczaposlitve.dao.PodjetjeRepository;
import um.feri.si.isakleczaposlitve.models.Oglas;
import um.feri.si.isakleczaposlitve.models.Podjetje;

import java.util.Optional;

@RestController
@RequestMapping("/Oglas")
public class OglasController {
    @Autowired
    private PodjetjeRepository podjetjeDao;
    @Autowired
    private OglasRepository oglasDao;

    @GetMapping("/getAll")
    public Iterable<Oglas> vrniVseOglase(){
        return oglasDao.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Oglas> vrniOglaseById(@PathVariable(name = "id") long id){
        return oglasDao.findById(id);
    }
    @PostMapping("/addOglas")
    public Oglas dodajOglas(@RequestBody Oglas oglas){
        return oglasDao.save(oglas);
    }

}
