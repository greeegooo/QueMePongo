package ropero;

import excepciones.PrendaException;
import helpers.Helper;
import ropero.caracteristicasDeLaPrenda.Color;
import ropero.caracteristicasDeLaPrenda.Material;
import ropero.caracteristicasDeLaPrenda.Tipo;
import ropero.caracteristicasDeLaPrenda.Trama;

public class PrendaBuilder {

    private String descripcion = "Prenda";
    private Tipo tipo;
    private Color colorPrimario;
    private Color colorSecundario;
    private Material material;
    private Trama trama = Trama.LISA;

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Trama getTrama() {
        return trama;
    }
    public void setTrama(Trama trama) {
        this.trama = trama;
    }

    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Color getColorPrimario() {
        return colorPrimario;
    }
    public void setColorPrimario(Color colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }
    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public Material getMaterial() {
        return material;
    }
    public void setMaterial(Material material) {
        this.material = material;
    }

    public Prenda build(){
        validar();
        return new Prenda(descripcion, tipo, material, colorPrimario, colorSecundario);
    }

    private void validar(){
        if(Helper.isNull(material)) throw new PrendaException("No se puede crear una prenda sin material.");
        if(Helper.isNull(colorPrimario)) throw new PrendaException("No se puede crear una prenda sin color primario.");
        if(Helper.isNull(tipo)) throw new PrendaException("No se puede crear una prenda sin tipo.");
        if(colorPrimario.equals(colorSecundario)) throw  new PrendaException("No se puede crear una prenda con colores iguales");
    }
}
