package ropero.estadosDeLaPrenda;

import excepciones.PrendaException;
import ropero.Prenda;

public class Percudido extends EstadoPrenda {

    public Percudido() {
        descripcion = DescripcionEstadoPrenda.PERCUDIDO;
    }

    @Override
    public void usar(Prenda prenda) {
        throw new PrendaException("No se puede usar una prenda percudida");
    }

    @Override
    public boolean sePuedeUsar() {
        return false;
    }
}
