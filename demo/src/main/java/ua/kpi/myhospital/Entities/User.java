package ua.kpi.myhospital.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
  @Id
  private Integer idUser;
  private String name;
  private String surName;
  private String role;

  public User() {
  }

  public User(Integer idUser, String login, String password, String name, String surName, String role){
    this.idUser = idUser;
    this.name = name;
    this.surName = surName;
    this.role = role;
  }
  public long getIduser() {
    return idUser;
  }

  public void setIduser(Integer idUser) {
    this.idUser = idUser;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getSurName() {
    return surName;
  }

  public void setSurName(String surName) {
    this.surName = surName;
  }


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

}
