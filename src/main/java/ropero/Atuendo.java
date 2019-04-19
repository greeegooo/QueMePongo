package ropero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Atuendo {

    private Prenda prendaSuperior;
    private Prenda prendaInferior;
    private Prenda calzado;
    private Prenda Accesorio;

    public Atuendo(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
        if(prendaInferior == null) throw new RuntimeException("Prenda Inferior no puede estar vacío");
        if(prendaSuperior == null) throw new RuntimeException("Prenda Superior no puede estar vacío");
        if(calzado == null) throw new RuntimeException("Calzado no puede estar vacío");

        this.prendaSuperior = prendaSuperior;
        this.prendaInferior = prendaInferior;
        this.calzado = calzado;
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

    public Prenda getAccesorio() {
        return Accesorio;
    }

    public void setAccesorio(Prenda accesorio) {
        Accesorio = accesorio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Atuendo)) return false;
        Atuendo atuendo = (Atuendo) o;
        return prendaSuperior.equals(atuendo.prendaSuperior) &&
                prendaInferior.equals(atuendo.prendaInferior) &&
                calzado.equals(atuendo.calzado) &&
                Objects.equals(Accesorio, atuendo.Accesorio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prendaSuperior, prendaInferior, calzado, Accesorio);
    }
}
