package com.company;

public class Main {

    public static void main(String[] args) {
        String mesaj = "bugün hava çok güzel";
        String yeniMesaj=sehirVer();
        System.out.println(yeniMesaj);
        int sayi=topla(52,61);
        System.out.println(sayi);

    }
    public static void ekle (){
        System.out.println("eklendi");

    }
    public static void sil (){
        System.out.println("silindi");

    }
    public static void guncelle () {
        System.out.println("güncellendi");

    }
    public static  int topla (int sayi1 ,int sayi2){
    return sayi1+sayi2;
    }
    public static String sehirVer (){
        return "ordu";
    }

}
