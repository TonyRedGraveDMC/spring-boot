package ua.kpi.myhospital.Entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class Prescription {
  @Id
  private Integer idPrescription;
  private int idDoc;
  private int idPatient;
  private int idExecutor;
  private String kind;
  public Prescription() {}

  public Prescription(Integer idPrescription,String kind, int idDoc, int idPatient, int idExecutor) {
    this.idPrescription = idPrescription;
    this.idDoc = idDoc;
    this.idPatient = idPatient;
    this.kind = kind;
    this.idExecutor = idExecutor;
  }

  public Integer getIdPrescription() {
    return idPrescription;
  }

  public void setIdPrescription(Integer idPrescription) {
    this.idPrescription = idPrescription;
  }


  public int getIdDoc() {
    return idDoc;
  }

  public void setIdDoc(int idDoc) {
    this.idDoc = idDoc;
  }


  public int getIdPatient() {
    return idPatient;
  }

  public void setIdPatient(int idPatient) {
    this.idPatient = idPatient;
  }


  public int getIdExecutor() {
    return idExecutor;
  }

  public void setIdExecutor(int idExecutor) {
    this.idExecutor = idExecutor;
  }

  public String getKind() {
    return kind;
  }
  public void setKind(String kind) {
    this.kind = kind;
  }
}
