package ropero;

import excepciones.PrendaException;
import helpers.Helper;
import ropero.caracteristicasDeLaPrenda.Color;
import ropero.caracteristicasDeLaPrenda.Material;
import ropero.caracteristicasDeLaPrenda.Tipo;

public class Prenda {
    private Tipo tipo;
    private Color colorPrimario;
    private Color colorSecundario;
    private Material material;

    public Prenda(Tipo tipo, Material material, Color colorPrimario){
        if(Helper.isNull(material)) {
            throw new PrendaException("No se puede crear una prenda sin material.");
        }
        if(Helper.isNull(colorPrimario)) {
            throw new PrendaException("No se puede crear una prenda sin color primario.");
        }
        if(Helper.isNull(tipo)) {
            throw new PrendaException("No se puede crear una prenda sin tipo.");
        }
        this.tipo = tipo;
        this.colorPrimario = colorPrimario;
        this.material = material;
    }
    public Prenda(Tipo tipo, Material material, Color colorPrimario, Color colorSecundario){
        this(tipo, material, colorPrimario);
        this.colorSecundario = colorSecundario;
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
