package ua.kpi.myhospital.prescription;

import org.springframework.data.repository.CrudRepository;
import ua.kpi.myhospital.Repo.Prescription;

public interface PrescriptionRepository extends CrudRepository<Prescription, Integer> {

}
