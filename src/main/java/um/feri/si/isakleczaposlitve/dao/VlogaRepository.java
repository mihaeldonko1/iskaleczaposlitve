package um.feri.si.isakleczaposlitve.dao;

import org.springframework.data.repository.CrudRepository;
import um.feri.si.isakleczaposlitve.models.Admin;
import um.feri.si.isakleczaposlitve.models.Vloga;

public interface VlogaRepository extends CrudRepository<Vloga, Long> {
}
