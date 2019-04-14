package ropero;

import excepciones.PrendaException;
import helpers.Helper;
import ropero.caracteristicasDeLaPrenda.Color;
import ropero.caracteristicasDeLaPrenda.Material;
import ropero.caracteristicasDeLaPrenda.Tipo;

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

    public String getDescripcion() {
        return descripcion;
    }

    public Tipo getTipo() {
        return tipo;
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
}