package com.gizemkuscuoglu;

public class AppMain {

    public static void main(String[] args) {

        Muhasebe muhasebe = new Muhasebe();
        muhasebe.setAdi("Burak");
        muhasebe.setSoyadi("Delice");
        muhasebe.setMaliYetki(Boolean.TRUE);
        muhasebe.setKidemYili((short) 5);
        muhasebe.setUnvani("Mali müşavir");

        System.out.println("Adı: "  + muhasebe.getAdi());
        System.out.println("Soyadı: " + muhasebe.getSoyadi());
        System.out.println("Mali yetki: " + muhasebe.getMaliYetki());
        System.out.println("Kıdem yılı: " + muhasebe.getKidemYili());
        System.out.println("Unvanı: " + muhasebe.getUnvani());

        muhasebe.hesapla();
        muhasebe.hesapla(75);

        String gelenCevap= muhasebe.selamVer("Serkan");
        System.out.println(gelenCevap);



    }
}
