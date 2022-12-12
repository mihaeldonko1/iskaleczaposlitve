package um.feri.si.isakleczaposlitve.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import um.feri.si.isakleczaposlitve.models.Admin;
import um.feri.si.isakleczaposlitve.models.Uporabnik;

public interface UporabnikRepository extends CrudRepository<Uporabnik, Long> {
}
