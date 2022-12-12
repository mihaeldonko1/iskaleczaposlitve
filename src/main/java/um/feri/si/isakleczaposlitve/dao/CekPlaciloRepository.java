package um.feri.si.isakleczaposlitve.dao;

import org.springframework.data.repository.CrudRepository;
import um.feri.si.isakleczaposlitve.models.Admin;
import um.feri.si.isakleczaposlitve.models.CekPlacilo;

public interface CekPlaciloRepository extends CrudRepository<CekPlacilo, Long> {
}
