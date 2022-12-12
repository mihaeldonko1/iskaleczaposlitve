package um.feri.si.isakleczaposlitve.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import um.feri.si.isakleczaposlitve.dao.OglasRepository;
import um.feri.si.isakleczaposlitve.dao.PodjetjeRepository;
import um.feri.si.isakleczaposlitve.models.Napotnica;
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

    @PutMapping("/update/{id}")
    public ResponseEntity<Oglas> updateOglas(@PathVariable long id,@RequestBody Oglas oglasDetails) {
        Optional<Oglas> updateOglas = oglasDao.findById(id);

        Oglas vao = updateOglas.get();
        oglasDao.save(oglasDetails);

        return ResponseEntity.ok(vao);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Oglas> deleteOglas(@PathVariable("id") long id) {
        Optional<Oglas> val = oglasDao.findById(id);

        Oglas vao=val.get();
        oglasDao.delete(vao);

        return ResponseEntity.ok(vao);
    }

    @GetMapping("/najboljsi")
    public Iterable<Oglas> najboljsiOglasi(){
        return oglasDao.najboljsiOglasi();
    }

    @GetMapping("/oglas-od/{ime}")
    public Iterable<Oglas> vrniOglaseOd(@PathVariable(name = "ime") String ime){
        return oglasDao.vrniOglaseOd(ime);
    }

}
