package ua.kpi.myhospital.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Prescription {
  @Id
  private Integer idPrescription;
  private Integer idDoc;
  private Integer idPatient;
  private String kind;
  private Integer idExecutor;
  private String finalDiagnos;


  public Prescription() {}

  public Prescription(Integer idPrescription, Integer idDoc, Integer idPatient, String kind, Integer idExecutor) {
    this.idPrescription = idPrescription;
    this.idDoc = idDoc;
    this.idPatient = idPatient;
    this.kind = kind;
    this.idExecutor = idExecutor;
  }

  public long getIdPrescription() {
    return idPrescription;
  }

  public void setIdPrescription(Integer idPrescription) {
    this.idPrescription = idPrescription;
  }


  public long getIdDoc() {
    return idDoc;
  }

  public void setIdDoc(Integer idDoc) {
    this.idDoc = idDoc;
  }


  public long getIdPatient() {
    return idPatient;
  }

  public void setIdPatient(Integer idPatient) {
    this.idPatient = idPatient;
  }


  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }


  public long getIdExecutor() {
    return idExecutor;
  }

  public void setIdExecutor(Integer idExecutor) {
    this.idExecutor = idExecutor;
  }

}
