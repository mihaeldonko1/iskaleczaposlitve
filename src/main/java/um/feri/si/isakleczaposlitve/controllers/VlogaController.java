package um.feri.si.isakleczaposlitve.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import um.feri.si.isakleczaposlitve.dao.OglasRepository;
import um.feri.si.isakleczaposlitve.dao.PodjetjeRepository;
import um.feri.si.isakleczaposlitve.dao.VlogaRepository;
import um.feri.si.isakleczaposlitve.models.Oglas;
import um.feri.si.isakleczaposlitve.models.Podjetje;
import um.feri.si.isakleczaposlitve.models.Vloga;

import java.util.Optional;

@RestController
@RequestMapping("/vloga")
public class VlogaController {
    @Autowired
    private VlogaRepository vlogaDao;
    @GetMapping("/getAll")
    public Iterable<Vloga> vrniVseVloge(){
        return vlogaDao.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Vloga> vrniVlogeById(@PathVariable(name = "id") long id){
        return vlogaDao.findById(id);
    }
    @PostMapping("/addOglas")
    public Vloga dodajVlogo(@RequestBody Vloga vloga){
        return vlogaDao.save(vloga);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Vloga> updateVloga(@PathVariable long id, @RequestBody Vloga vlogaDetails) {
        Optional<Vloga> updateVloga = vlogaDao.findById(id);

        Vloga vao = updateVloga.get();
        vlogaDao.save(vlogaDetails);

        return ResponseEntity.ok(vao);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Vloga> deletePodjetje(@PathVariable("id") long id) {
        Optional<Vloga> val = vlogaDao.findById(id);

        Vloga vao=val.get();
        vlogaDao.delete(vao);

        return ResponseEntity.ok(vao);
    }

}
