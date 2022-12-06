package um.feri.si.isakleczaposlitve.dao;

import org.springframework.data.repository.CrudRepository;
import um.feri.si.isakleczaposlitve.models.Oglas;
import um.feri.si.isakleczaposlitve.models.Podjetje;

public interface OglasRepository extends CrudRepository<Oglas, Long> {
}
