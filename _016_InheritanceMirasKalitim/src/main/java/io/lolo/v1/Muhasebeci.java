package io.lolo.v1;

public class Muhasebeci extends Personel {

    private String muhasebeciUnvan;

    private long gorevTazminati;

    public String getMuhasebeciUnvan() {
        return muhasebeciUnvan;
    }

    public void setMuhasebeciUnvan(String muhasebeciUnvan) {
        this.muhasebeciUnvan = muhasebeciUnvan;
    }

    public long getGorevTazminati() {
        return gorevTazminati;
    }

    public void setGorevTazminati(long gorevTazminati) {
        this.gorevTazminati = gorevTazminati;
    }
}
