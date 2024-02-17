package com.enes;

public class CustomStringTr {
    String ifade="Java yazilim dilini ogreniyorum.";
    public void altDize(){
        System.out.println(ifade.substring(0,6));
    }
    public void dizin(){
        System.out.println(ifade.indexOf("Y"));
    }
    public void birlestirme(){
        System.out.println(ifade.concat("MongoDB ye gecis yapicaz"));

    }
    public void karakter(){
        System.out.println(ifade.charAt(6));
        System.out.println(ifade.length());
    }
    public void uzunluk(){

        System.out.println(ifade.length());
    }
    public void ileBiter(){

        System.out.println(ifade.endsWith("OGRENIYORUM"));//false
        System.out.println(ifade.endsWith("."));//true

    }
    public void ileBaslar()
    {

        System.out.println(ifade.startsWith(" JAVA"));//false
        System.out.println(ifade.startsWith("JAVA"));//true

    }
    public void ileBitder()
    {

        System.out.println(ifade.endsWith("OGRENIYORUM"));//false
        System.out.println(ifade.endsWith("."));//true


    }
    public void kucukHarf()
    {
        System.out.println(ifade.toLowerCase());
    }
    public void buyukHarf()
    {
        System.out.println(ifade.toUpperCase());
    }
    public void icerir()
    {


        System.out.println(ifade.contains("Java"));//true
        System.out.println(ifade.contains("C#"));//false


    }
}
