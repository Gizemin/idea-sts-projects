package io.lolo;

public class AppBanka {

    public static void main(String[] args) {
        Musteri musteri= new Musteri();

        musteri.setAdi("Ali");
        musteri.setSoyAdi("Güneş");
        musteri.setHesapCuzdan(10000.0);
        musteri.setHesapNo(123456789L);

        System.out.println(musteri);

    }
}
