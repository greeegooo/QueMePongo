package ropero;

import excepciones.PrendaException;
import ropero.caracteristicasDeLaPrenda.Color;
import ropero.caracteristicasDeLaPrenda.Material;
import ropero.caracteristicasDeLaPrenda.Tipo;

public class Prenda {
    private Tipo tipo;
    private Color colorPrimario;
    private Color colorSecundario;
    private Material material;

    public Prenda(Tipo tipo, Material material, Color colorPrimario){
        setTipo(tipo);
        setMaterial(material);
        setColorPrimario(colorPrimario);
    }
    public Prenda(Tipo tipo, Material material, Color colorPrimario, Color colorSecundario){
        setTipo(tipo);
        setMaterial(material);
        setColorPrimario(colorPrimario);
        setColorSecundario(colorSecundario);
    }

    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) throws PrendaException {
        if(tipo.equals(null)) {
            throw new PrendaException("No se puede crear una prenda sin tipo.");
        }
        this.tipo = tipo;
    }

    public Color getColorPrimario() {
        return colorPrimario;
    }
    public void setColorPrimario(Color colorPrimario) throws PrendaException {
        if(colorPrimario.equals(null)) {
            throw new PrendaException("No se puede crear una prenda sin color primario.");
        }
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
    public void setMaterial(Material material) throws PrendaException {
        if(colorPrimario.equals(null)) {
            throw new PrendaException("No se puede crear una prenda sin material.");
        }
        this.material = material;
    }
}
