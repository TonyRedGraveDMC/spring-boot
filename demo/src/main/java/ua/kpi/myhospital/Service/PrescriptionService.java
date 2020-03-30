package ua.kpi.myhospital.prescription;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.kpi.myhospital.Repo.Prescription;

import java.util.ArrayList;
import java.util.List;


@Service
public class PrescriptionService {
    @Autowired
    private PrescriptionRepository prescriptionRepository;


    public List<Prescription> getAllPrescriptions() {
        List<Prescription> prescriptions = new ArrayList<>();
        prescriptionRepository.findAll().forEach(prescriptions::add);
        return prescriptions;
    }

    public Prescription getPrescription(Integer idPrescription){
       return prescriptionRepository.findById(idPrescription).get();
    }

    public void addPrescription(Prescription prescription) {
        prescriptionRepository.save(prescription);
    }

    public void deletePrescription(Integer idPrescription){
        prescriptionRepository.deleteById(idPrescription);
    }

    public void uppdatePrescription(Prescription prescription, Integer idPrescription){
        prescriptionRepository.save(prescription);
    }
}
