package com.enes.entity;

public class Kuslar extends Hayvanlar implements IHayvanDavranis{
    private int havadaKalmaSuresi;
   private boolean kanatliMi;
   int ay;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Kuslar{");
        sb.append("id='").append(getId()).append('\'');
        sb.append(", havadaKalmaSuresi=").append(havadaKalmaSuresi);

        if (isKanatliMi()==true) {
            sb.append(", ").append("KANATLI").append('\'');
        }
        else {
            sb.append(", ").append("KANATSIZ").append('\'');
        }
        sb.append(", tur='").append(getTur()).append('\'');
        sb.append(", ad='").append(getAd()).append('\'');
        sb.append(", yasamSuresi=").append(getYasamSuresi());
        sb.append(", yas=").append(getYas());

        sb.append('}');
        return sb.toString();
    }



    public Kuslar(String tur, String ad, int yasamSuresi, int yas, int havadaKalmaSuresi, boolean kanatliMi)
    {
        super(tur, ad, yasamSuresi, yas);
        this.havadaKalmaSuresi = havadaKalmaSuresi;
        this.kanatliMi = kanatliMi;
    }

    public int getHavadaKalmaSuresi() {
        return havadaKalmaSuresi;
    }

    public void setHavadaKalmaSuresi(int havadaKalmaSuresi) {
        this.havadaKalmaSuresi = havadaKalmaSuresi;
    }

    public boolean isKanatliMi() {
        return kanatliMi;
    }

    public void setKanatliMi(boolean kanatliMi) {
        this.kanatliMi = kanatliMi;
    }

    @Override
    public void yemVer() {
        System.out.println(getClass().getSimpleName()+" BOCEK YEDI ");
    }

    @Override
    public void suVer() {
        System.out.println(getClass().getSimpleName()+ "a 5 SAAT ICINDE SU VERILDI");
    }

    @Override
    public void ureme(int ay)
    {
        if (ay>=0 && ay<7) {
            int kalanAy=7-ay;

             if (ay < 7) {
                System.out.println(getClass().getSimpleName()+"in DOGURMASINA "+kalanAy+" AY VAR");
            }
            else if (ay == 7) {
                System.out.println(getClass().getSimpleName()+" BU AY DOGURDU");
            }
        }
        else {
            System.out.println("LUTFEN DOGRU DEGER GIRINIZ");
        }
    }

    @Override
    public void hareketetme() {
        System.out.println(getClass().getSimpleName()+"UCUYOR");
    }
}


