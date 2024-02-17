package com.enes;

public class EsnekDizi {
    int[] sayi = {1, 2, 3, 4};
    public void add(int ekleneceksayi) {
        int[] tmp=new int[sayi.length+1];
        for (int i=0;i<sayi.length;i++)
        {
            tmp[i]=sayi[i];
        }
        tmp[sayi.length]=ekleneceksayi ;
        sayi=tmp;
    }

    public void remove(int index) {

        int[] geciciDizi = new int[sayi.length-1];
        int sayac=0;
        for (int i = 0; i < sayi.length; i++) {
            if (i==index) {
                sayac++;
                continue;
            }

                geciciDizi[i-sayac] = sayi[i];

        }
        sayi=geciciDizi;
    }
    public void insert(int index,int insertsayi) {

        if (index < sayi.length) {

            if (sayi[index] == 0) {
                sayi[index] = insertsayi;

            } else
                System.out.println("DEGİSTİRME YERİ DOLUDUR");
        } else {
            int[] tmp = new int[index + 1];
            for (int i = 0; i < sayi.length; i++) {
                tmp[i] = sayi[i];
            }
            tmp[index] = insertsayi;
            sayi = tmp;
        }
    }



        public void list () {
            for (int i = 0; i < sayi.length; i++) {
                System.out.print(sayi[i] + " ");
            }
            System.out.println();
        }

    }



