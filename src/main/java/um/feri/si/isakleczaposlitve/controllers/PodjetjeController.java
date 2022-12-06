package um.feri.si.isakleczaposlitve.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import um.feri.si.isakleczaposlitve.dao.PodjetjeRepository;
import um.feri.si.isakleczaposlitve.models.Podjetje;

import java.util.Optional;

@RestController
@RequestMapping("/Podjetje")
public class PodjetjeController {

    @Autowired
    private PodjetjeRepository podjetjeDao;

    @GetMapping("/getAll")
    public Iterable<Podjetje> vrniVsaPodjetja(){
        return podjetjeDao.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Podjetje> vrniPodjetjeById(@PathVariable(name = "id") long id){
        return podjetjeDao.findById(id);
    }
    @PostMapping("addPodjetje")
    public Podjetje dodajPodjetje(@RequestBody Podjetje podjetje){
        return podjetjeDao.save(podjetje);
    }

}
