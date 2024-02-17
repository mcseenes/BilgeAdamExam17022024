package com.enes;

import com.enes.entity.Hayvanlar;
import com.enes.entity.Kuslar;
import com.enes.entity.Memeliler;
import com.enes.entity.Surungenler;

public class RunnerHayvanlar {
    public static void main(String[] args) {
    Memeliler memeliler=new Memeliler("UCAN","YARASA",12,20);
    Hayvanlar hayvanlar=new Hayvanlar();
    Kuslar kuslar=new Kuslar("UCAN","KARTAL",12,9,5,true);
    Surungenler surungenler=new Surungenler("SURUNGEN","TIMSAH",50,30,false);
        System.out.println(memeliler.toString());
        System.out.println(kuslar.toString());
        System.out.println(surungenler.toString());
        hayvanlar.yas(2000);
        surungenler.ureme(6);
        memeliler.ureme(2);
        kuslar.yemVer();
        memeliler.suVer();
        kuslar.suVer();





    }
}
