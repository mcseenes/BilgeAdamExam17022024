package com.enes.entity;

import com.enes.entity.Hayvanlar;

public class Surungenler extends Hayvanlar implements IHayvanDavranis{
    private boolean TuyluMu;
    public Surungenler(String tur, String ad, int yasamSuresi, int yas,boolean tuyluMu) {
        super(tur, ad, yasamSuresi, yas);
    }



    public boolean isTuyluMu() {
        return TuyluMu;
    }

    public void setTuyluMu(boolean tuyluMu) {
        TuyluMu = tuyluMu;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Surungenler{");
        sb.append(", id='").append(getId()).append('\'');
        if (isTuyluMu()==true) {
            sb.append(", ").append("TUYLU").append('\'');
        }
        else {
            sb.append(", ").append("TUYSUZ").append('\'');
        }
        sb.append(", tur='").append(getTur()).append('\'');
        sb.append(", ad='").append(getAd()).append('\'');
        sb.append(", yasamSuresi=").append(getYasamSuresi());
        sb.append(", yas=").append(getYas());
       ;
        sb.append('}');
        return sb.toString();

    }

    @Override
    public void yemVer() {
        System.out.println(getClass().getSimpleName()+" KEMIRGEN VE OCEK YEDI ");
    }

    @Override
    public void suVer() {
        System.out.println(getClass().getSimpleName()+"e SU VERILDI ");
    }

    @Override
    public void ureme(int ay) {
        if (ay>=0 && ay<7) {
            int kalanAy=6-ay;
             if (ay < 6) {
                System.out.println(getClass().getSimpleName()+"in DOGURMASINA "+kalanAy+" AY VAR");
            }
            else if (ay == 6) {
                System.out.println(getClass().getSimpleName()+" BU AY DOGURDU");
            }
        }
        else {
            System.out.println("LUTFEN DOGRU DEGER GIRINIZ");
        }
    }

    @Override
    public void hareketetme() {
        System.out.println(getClass().getSimpleName()+"SURUNUYOR");
    }
}
