package ropero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Atuendo {
    private Prenda prendaSuperior;
    private Prenda prendaInferior;
    private Prenda calzado;

    public Atuendo(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
        this.prendaSuperior = prendaSuperior;
        this.prendaInferior = prendaInferior;
        this.calzado = calzado;
    }

    public List<Prenda> Prendas() {
        List<Prenda> prendas = new ArrayList<>();
        Collections.addAll(prendas, this.prendaSuperior, this.prendaInferior, this.calzado);
        return  prendas;
    }

    public Prenda getPrendaSuperior() {
        return prendaSuperior;
    }

    public Prenda getPrendaInferior() {
        return prendaInferior;
    }

    public Prenda getCalzado() {
        return calzado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Atuendo)) return false;
        Atuendo atuendo = (Atuendo) o;
        return prendaSuperior.equals(atuendo.prendaSuperior) &&
                prendaInferior.equals(atuendo.prendaInferior) &&
                calzado.equals(atuendo.calzado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prendaSuperior, prendaInferior, calzado);
    }
}
