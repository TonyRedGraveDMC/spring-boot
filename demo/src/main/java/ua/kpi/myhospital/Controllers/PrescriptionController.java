package ua.kpi.myhospital.prescription;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.kpi.myhospital.Repo.Prescription;

import java.util.List;

@RestController
public class PrescriptionController {

    @Autowired
    private PrescriptionService prescriptionService;

    @RequestMapping("/prescription")
    public List<Prescription> getAllPrescriptions() {
        return prescriptionService.getAllPrescriptions();
    }

    @RequestMapping("/prescription/{idPrescription}")
    public Prescription getById(@PathVariable Integer idPrescription) {
        return prescriptionService.getPrescription(idPrescription);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/prescription")
    public void addPrescription(@RequestBody Prescription prescription) {
        prescriptionService.addPrescription(prescription);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/prescription/{idPrescription}")
    public void deletePrescription(@PathVariable Integer idPrescription) {
        prescriptionService.deletePrescription(idPrescription);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/prescription/{idPrescription}")
    public void uppdatePrescription(@RequestBody Prescription prescription, @PathVariable Integer idPrescription){
        prescriptionService.deletePrescription(idPrescription);
    }



}



