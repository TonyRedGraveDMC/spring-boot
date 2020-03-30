package ua.kpi.myhospital.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Diagnos {
  @Id
  private Integer id;
  private long idDiagnos;
  private String currentDiagnos;
  private String healthStatus;

  Diagnos(){}
  Diagnos(Integer id, long idDiagnos, String currentDiagnos, String healthStatus){
    this.id = id;
    this.idDiagnos = idDiagnos;
    this.currentDiagnos = currentDiagnos;
    this.healthStatus = healthStatus;
  }

  public long getId() {
    return id;
  }

  public void setId(long Integer) {
    this.id = id;
  }

  public long getIdDiagnos() {
    return idDiagnos;
  }

  public void setIdDiagnos(long idDiagnos) {
    this.idDiagnos = idDiagnos;
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
