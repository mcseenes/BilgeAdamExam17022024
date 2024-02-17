package com.enes;

import com.enes.entity.Hayvanlar;
import com.enes.entity.Kuslar;
import com.enes.entity.Memeliler;
import com.enes.entity.Surungenler;

public class RunnerHayvanlar {
    public static void main(String[] args) {
    Hayvanlar memeliler=new Memeliler("MEMELI","YARASA",17,15);
    Memeliler memeliler1=new Memeliler("MEMELI","INEK",12,8);
    Hayvanlar hayvanlar=new Hayvanlar();
    Hayvanlar surungenler1=new Surungenler("SURUNGEN","TIMSAH",50,30,false);
    Kuslar kuslar=new Kuslar("UCAN","KARTAL",12,9,5,true);
    Surungenler surungenler=new Surungenler("SURUNGEN","TIMSAH",50,30,false);
        System.out.println(memeliler.toString());
        System.out.println(kuslar.toString());
        System.out.println(surungenler.toString());
        hayvanlar.yas(2000);
        surungenler.ureme(6);
        memeliler1.ureme(2);
        kuslar.yemVer();
        memeliler1.suVer();
        kuslar.suVer();







    }
}
