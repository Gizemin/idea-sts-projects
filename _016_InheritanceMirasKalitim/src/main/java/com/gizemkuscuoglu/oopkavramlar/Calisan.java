package com.gizemkuscuoglu.oopkavramlar;

//CLASS
public class Calisan {
//Fields// Variables

    private Long kimlikNo;
    private String adi;
    private String soyadi;

    private Float maas;

    private Boolean sigorta;
//Erişim belirteçleri private,public,protected - Encapsulation(Koruma)

    //Constructor // Hazırlayıcı Yapıcı
    public Calisan() {
    }

    public Calisan(Long kimlikNo, String adi, String soyadi, Float maas, Boolean sigorta) {
        this.kimlikNo = kimlikNo;
        this.adi = adi;
        this.soyadi = soyadi;
        this.maas = maas;
        this.sigorta = sigorta;
    }

    //Setter getter
    public Long getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(Long kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public Float getMaas() {
        return maas;
    }

    public void setMaas(Float maas) {
        this.maas = maas;
    }

    public Boolean getSigorta() {
        return sigorta;
    }

    public void setSigorta(Boolean sigorta) {
        this.sigorta = sigorta;
    }


    // toString metot


    @Override //ezme
    public String toString() {
        return "Calisan {" +
                "kimlikNo=" + kimlikNo +
                ", adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", maas=" + maas +
                ", sigorta=" + sigorta +
                '}';
    }


    //Sıradan bir metot
    public Float getMaasSonDurum(float asgariUcret, float bonus) {
        return asgariUcret * 3 + bonus;
    }


    // Polymorphism
    public Float getMaasSonDurum(float asgariUcret, float bonus, int ucretliIzın) {
        return asgariUcret * 3 + bonus + ucretliIzın * 14;
    }
}
