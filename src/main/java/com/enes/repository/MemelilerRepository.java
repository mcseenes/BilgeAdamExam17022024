package com.enes.repository;

import com.enes.entity.Hayvanlar;

public class MemelilerRepository  implements IHayvanlarRepository{
    @Override
    public void ekle() {
        System.out.println(getClass().getSimpleName()+"e VERI EKLENDI");
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

