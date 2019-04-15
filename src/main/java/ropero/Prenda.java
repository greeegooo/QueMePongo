package ropero;

import excepciones.PrendaException;
import helpers.Helper;
import ropero.caracteristicasDeLaPrenda.*;

import java.util.Objects;

public class Prenda {
    private String descripcion;
    private Tipo tipo;
    private Color colorPrimario;
    private Color colorSecundario;
    private Material material;
    private Trama trama;

    public Prenda(String descripcion, Tipo tipo, Material material, Trama trama, Color colorPrimario, Color colorSecundario){
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.colorPrimario = colorPrimario;
        this.material = material;
        this.trama = trama;
        this.colorSecundario = colorSecundario;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Categoria getCategoria() {
        return tipo.getCategoria();
    }

    public Color getColorPrimario() {
        return colorPrimario;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }

    public Material getMaterial() {
        return material;
    }

    public Trama getTrama() { return trama; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prenda)) return false;
        Prenda prenda = (Prenda) o;
        return descripcion.equals(prenda.descripcion) &&
                tipo.equals(prenda.tipo) &&
                colorPrimario.equals(prenda.colorPrimario) &&
                Objects.equals(colorSecundario, prenda.colorSecundario) &&
                material == prenda.material &&
                trama == prenda.trama;
    }

    @Override
    public int hashCode() {
        return Objects.hash(descripcion, tipo, colorPrimario, colorSecundario, material, trama);
    }
}