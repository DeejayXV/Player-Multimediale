package entities;

import interfaces.Riproducibile;

public abstract class ElementoRiproducibile extends ElementoMultimediale implements Riproducibile {
    protected int durata;

    public ElementoRiproducibile(String titolo, int durata) {
        super(titolo);
        this.durata = durata;
    }
}
