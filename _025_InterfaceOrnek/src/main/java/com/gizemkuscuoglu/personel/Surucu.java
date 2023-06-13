package com.gizemkuscuoglu.personel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Surucu extends Personel {

    private int ehliyetYili;

    @Override
    public String toString() {
        return "Surucu{" +
                "ehliyetYili=" + ehliyetYili +
                "} " + super.toString();
    }
}
