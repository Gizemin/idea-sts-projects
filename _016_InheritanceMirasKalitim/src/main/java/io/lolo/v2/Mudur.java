package io.lolo.v2;

public class Mudur extends Personel{

    private String mudurDerecesi;
    private String yoneticiDepartman;

    private String tahsisliPersonel;




    public Mudur() {
    }

    public Mudur(String mudurDerecesi, String yoneticiDepartman, String tahsisliPersonel, long gorevTazminati) {
        this.mudurDerecesi = mudurDerecesi;
        this.yoneticiDepartman = yoneticiDepartman;
        this.tahsisliPersonel = tahsisliPersonel;

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





}
