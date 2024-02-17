package com.enes.repository;

import com.enes.entity.Hayvanlar;

public class KuslarRepository  implements IHayvanlarRepository{
    @Override
    public void ekle() {
        System.out.println(getClass().getSimpleName()+"EdVERI EKLENDI");
    }

    @Override
    public void sil() {
        System.out.println(getClass().getSimpleName()+
                "den VERI SILINDI");
    }

    @Override
    public void guncelle() {
        System.out.println(getClass().getSimpleName()+
                "den VERI GUNCELLENDI");
    }
}
