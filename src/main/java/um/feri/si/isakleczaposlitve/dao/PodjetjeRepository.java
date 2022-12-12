package um.feri.si.isakleczaposlitve.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import um.feri.si.isakleczaposlitve.models.Oglas;
import um.feri.si.isakleczaposlitve.models.Podjetje;

import java.util.List;

public interface PodjetjeRepository extends CrudRepository<Podjetje, Long> {
    @Query("select h from Podjetje h where h.lokacija = 'Maribor' and h.oglas is not null")
    List<Oglas> podjetjaMaribor();
}
