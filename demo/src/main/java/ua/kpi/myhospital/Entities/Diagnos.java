package ua.kpi.myhospital.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Diagnos {
  @Id
  private Integer idDiagnos;
  private int  idPrescription;
  private String currentDiagnos;
  private String healthStatus;


  public Diagnos(){}

  public Diagnos( Integer idDiagnos, int idPrescription, String currentDiagnos, String healthStatus){
    this.idDiagnos = idDiagnos;
    this.idPrescription = idPrescription;
    this.currentDiagnos = currentDiagnos;
    this.healthStatus = healthStatus;
  }


  public Integer getIdDiagnos() {
    return idDiagnos;
  }
  public void setIdDiagnos(Integer idDiagnos) {
    this.idDiagnos = idDiagnos;
  }
  public int getIdPrescription() {
    return idPrescription;
  }
  public void setIdPrescription(int idPrescription) {
    this.idPrescription = idPrescription;
  }
  public String getCurrentDiagnos() {
    return currentDiagnos;
  }
  public void setCurrentDiagnos(String currentDiagnos) {
    this.currentDiagnos = currentDiagnos;
  }
  public String getHealthStatus() {
    return healthStatus;
  }
  public void setHealthStatus(String healthStatus) {
    this.healthStatus = healthStatus;
  }



}
