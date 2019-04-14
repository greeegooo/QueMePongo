package ropero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
}
