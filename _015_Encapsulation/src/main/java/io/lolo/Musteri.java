package io.lolo;

public class Musteri {

    private Long hesapNo;

    private String adi;

    private String soyAdi;


    private Double hesapCuzdan;

    public Musteri() {


    }

    public Musteri(Long hesapNo, String adi, String soyAdi, Double hesapCuzdan) {
        this.hesapNo = hesapNo;
        this.adi = adi;
        this.soyAdi = soyAdi;
        this.hesapCuzdan = hesapCuzdan;
    }

    public Long getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(Long hesapNo) {
        this.hesapNo = hesapNo;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyAdi() {
        return soyAdi;
    }

    public void setSoyAdi(String soyAdi) {
        this.soyAdi = soyAdi;
    }

    public Double getHesapCuzdan() {
        return hesapCuzdan;
    }

    public void setHesapCuzdan(Double hesapCuzdan) {
        this.hesapCuzdan = hesapCuzdan;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "hesapNo=" + hesapNo +
                ", adi='" + adi + '\'' +
                ", soyAdi='" + soyAdi + '\'' +
                ", hesapCuzdan=" + hesapCuzdan +
                '}';
    }
}
