package com.enes.entity;

public class Memeliler extends Hayvanlar implements IHayvanDavranis{
    private int dogurmaSuresi;

    public Memeliler(String tur, String ad, int yasamSuresi, int yas) {
        super(tur, ad, yasamSuresi, yas);
    }

    public int getDogurmaSuresi() {
        return dogurmaSuresi;
    }

    public void setDogurmaSuresi(int dogurmaSuresi) {
        this.dogurmaSuresi = dogurmaSuresi;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Memeliler{");
        sb.append(", id='").append(getId()).append('\'');
        sb.append(", dogurmaSuresi=").append(dogurmaSuresi);
        sb.append(", tur='").append(getTur()).append('\'');
        sb.append(", ad='").append(getAd()).append('\'');
        sb.append(", yasamSuresi=").append(getYasamSuresi());
        sb.append(", yas=").append(getYas());

        sb.append('}');
        return sb.toString();
    }

    @Override
    public void yemVer() {
        System.out.println(getClass().getSimpleName()+" ET YEDI");
    }

    @Override
    public void suVer() {
        System.out.println(getClass().getSimpleName()+"e SU VERILDI ");
    }

    @Override
    public void ureme(int ay) {
        if (ay>0 && ay<9) {
            int kalanAy = 9-ay;

            if (ay < 9) {
                System.out.println(getClass().getSimpleName()+"in DOGURMASINA "+kalanAy+" AY VAR");
            }
            else if (ay == 9) {
                System.out.println(getClass().getSimpleName()+" BU AY DOGURDU");
            }
        }
        else {
            System.out.println("LUTFEN DOGRU DEGER GIRINIZ");
        }

    }

    @Override
    public void hareketetme() {
        System.out.println(getClass().getSimpleName()+"KOSUYOR");
    }
}
