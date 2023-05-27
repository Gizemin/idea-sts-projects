package io.lolo.v1;

public class Mudur extends Personel {

    private String mudurDerecesi;
    private String yoneticiDepartman;

    private String tahsisliPersonel;

    private long gorevTazminati;


    public Mudur() {
    }

    public Mudur(String mudurDerecesi, String yoneticiDepartman, String tahsisliPersonel, long gorevTazminati) {
        this.mudurDerecesi = mudurDerecesi;
        this.yoneticiDepartman = yoneticiDepartman;
        this.tahsisliPersonel = tahsisliPersonel;
        this.gorevTazminati = gorevTazminati;
    }

    public String getMudurDerecesi() {
        return mudurDerecesi;
    }

    public void setMudurDerecesi(String mudurDerecesi) {
        this.mudurDerecesi = mudurDerecesi;
    }

    public String getYoneticiDepartman() {
        return yoneticiDepartman;
    }

    public void setYoneticiDepartman(String yoneticiDepartman) {
        this.yoneticiDepartman = yoneticiDepartman;
    }

    public String getTahsisliPersonel() {
        return tahsisliPersonel;
    }

    public void setTahsisliPersonel(String tahsisliPersonel) {
        this.tahsisliPersonel = tahsisliPersonel;
    }

    public long getGorevTazminati() {
        return gorevTazminati;
    }

    public void setGorevTazminati(long gorevTazminati) {
        this.gorevTazminati = gorevTazminati;
    }



}
