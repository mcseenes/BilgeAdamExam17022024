package com.enes.entity;

import java.util.Random;
import java.util.UUID;

public class Hayvanlar extends BaseEntity{
  private String id;
  private String tur;
  private String ad;
  private int yasamSuresi;
  private int yas;

  public Hayvanlar(){}

  public Hayvanlar(String tur, String ad, int yasamSuresi, int yas) {
    this.id=id;
    this.tur = tur;
    this.ad = ad;
    this.yasamSuresi = yasamSuresi;
    this.yas = yas;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Hayvanlar{");
    sb.append("id='").append(id).append('\'');
    sb.append(", tur='").append(tur).append('\'');
    sb.append(", ad='").append(ad).append('\'');
    sb.append(", yasamSuresi=").append(yasamSuresi);
    sb.append(", yas=").append(yas);
    sb.append('}');
    return sb.toString();
  }

  public String getTur() {
    return tur;
  }

  public void setTur(String tur) {
    this.tur = tur;
  }

  public String getAd() {
    return ad;
  }

  public void setAd(String ad) {
    this.ad = ad;
  }

  public int getYasamSuresi() {
    return yasamSuresi;
  }

  public void setYasamSuresi(int yasamSuresi) {
    this.yasamSuresi = yasamSuresi;
  }

  public int getYas() {
    return yas;
  }

  public void setYas(int yas) {
    this.yas = yas;
  }

  public String getId() {
    UUID randomUUID=UUID.randomUUID();


    return randomUUID.toString();

  }
  public int  yas(int dYil)
  {
    int yas=2024-dYil;
    System.out.println("HAYVANIN YASI:"+yas);
    return yas;
  }

}
