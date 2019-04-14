package ropero;

import excepciones.PrendaException;
import helpers.Helper;
import ropero.caracteristicasDeLaPrenda.Color;
import ropero.caracteristicasDeLaPrenda.Material;
import ropero.caracteristicasDeLaPrenda.Tipo;
import ropero.caracteristicasDeLaPrenda.Trama;

public class BorradorPrenda {

    private String descripcion = "Prenda";
    private Tipo tipo;
    private Color colorPrimario;
    private Color colorSecundario;
    private Material material;
    private Trama trama = Trama.LISA;

    public String getDescripcion() {
        return descripcion;
    }
    public BorradorPrenda setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public Trama getTrama() {
        return trama;
    }
    public BorradorPrenda setTrama(Trama trama) {
        this.trama = trama;
        return this;
    }

    public Tipo getTipo() {
        return tipo;
    }
    public BorradorPrenda setTipo(Tipo tipo) {
        this.tipo = tipo;
        return this;
    }

    public Color getColorPrimario() {
        return colorPrimario;
    }
    public BorradorPrenda setColorPrimario(Color colorPrimario) {
        this.colorPrimario = colorPrimario;
        return this;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }
    public BorradorPrenda setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
        return this;
    }

    public Material getMaterial() {
        return material;
    }
    public BorradorPrenda setMaterial(Material material) {
        this.material = material;
        return this;
    }

    public Prenda build(){
        validar();
        return new Prenda(descripcion, tipo, material, colorPrimario, colorSecundario);
    }

    private void validar(){
        if(Helper.isNull(material)) throw new PrendaException("No se puede crear una prenda sin material.");
        if(Helper.isNull(colorPrimario)) throw new PrendaException("No se puede crear una prenda sin color primario.");
        if(Helper.isNull(tipo)) throw new PrendaException("No se puede crear una prenda sin tipo.");
    }
}
