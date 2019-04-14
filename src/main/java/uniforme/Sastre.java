package uniforme;

import ropero.BorradorPrenda;
import ropero.Prenda;

public abstract class Sastre {

    protected BorradorPrenda borradorPrenda = new BorradorPrenda();

    public abstract Prenda CrearPrendaSuperior();

    public abstract Prenda CrearPrendaInferior();

    public abstract Prenda CrearCalzado();
}
