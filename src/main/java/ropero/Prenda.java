package ropero;

import excepciones.PrendaException;
import helpers.Helper;
import ropero.caracteristicasDeLaPrenda.Categoria;
import ropero.caracteristicasDeLaPrenda.Color;
import ropero.caracteristicasDeLaPrenda.Material;
import ropero.caracteristicasDeLaPrenda.Tipo;

import java.util.Objects;

public class Prenda {
    private String descripcion;
    private Tipo tipo;
    private Color colorPrimario;
    private Color colorSecundario;
    private Material material;

    public Prenda(String descripcion, Tipo tipo, Material material, Color colorPrimario){
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.colorPrimario = colorPrimario;
        this.material = material;
    }
    public Prenda(String descripcion, Tipo tipo, Material material, Color colorPrimario, Color colorSecundario){
        this(descripcion, tipo, material, colorPrimario);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prenda)) return false;
        Prenda prenda = (Prenda) o;
        return descripcion.equals(prenda.descripcion) &&
                tipo.equals(prenda.tipo) &&
                colorPrimario.equals(prenda.colorPrimario) &&
                Objects.equals(colorSecundario, prenda.colorSecundario) &&
                material == prenda.material;
    }

    @Override
    public int hashCode() {
        return Objects.hash(descripcion, tipo, colorPrimario, colorSecundario, material);
    }
}