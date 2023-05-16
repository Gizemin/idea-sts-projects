package org.gizemkuscuoglu.isyeri;

public class AppIsyeriMerkez {

    public static void main(String[] args) {

        Yazilimci yazilimci = new Yazilimci();
        System.out.println("MAAŞ:" + (yazilimci.asgariUcret + yazilimci.bonus + 1000));
        System.out.println("SGK: " + ((yazilimci.sigorta==true) ? "Evet":"HAYIR") );
        System.out.println( "ÖZEL SAĞLIK SİGORTASI:" + yazilimci.ozelSaglikSigortasi);
        System.out.println("İZİN HAKKI" + yazilimci.izinHakki);
     /*
        if (şart) {
            evet
        }
            else {
                hayır
        }

      şart? evet : hayır
     */

        Ceo ceo=new Ceo();
        System.out.println(ceo.asgariUcret+ceo.bonus);
        System.out.println(ceo.sigorta);
        System.out.println(ceo.izinHakki+ceo.ekİzin);;


    }
}
