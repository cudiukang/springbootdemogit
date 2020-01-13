package com.example.entity;


public class User {

  private long id;
  private String uName;
  private String uPwd;
  private String uSex;
  private String uRealName;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUName() {
    return uName;
  }

  public void setUName(String uName) {
    this.uName = uName;
  }


  public String getUPwd() {
    return uPwd;
  }

  public void setUPwd(String uPwd) {
    this.uPwd = uPwd;
  }


  public String getUSex() {
    return uSex;
  }

  public void setUSex(String uSex) {
    this.uSex = uSex;
  }


  public String getURealName() {
    return uRealName;
  }

  public void setURealName(String uRealName) {
    this.uRealName = uRealName;
  }

}
