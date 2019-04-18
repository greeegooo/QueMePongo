package ropero.estadosDeLaPrenda;

import excepciones.PrendaException;
import ropero.Prenda;

public class Lavando extends EstadoPrenda {

    public Lavando() {
        descripcion = DescripcionEstadoPrenda.LAVANDO;
    }

    @Override
    public void usar(Prenda prenda) {
        throw new PrendaException("No se puede usar una prenda cuando se está lavando");
    }

    @Override
    public boolean sePuedeUsar() {
        return false;
    }
}
