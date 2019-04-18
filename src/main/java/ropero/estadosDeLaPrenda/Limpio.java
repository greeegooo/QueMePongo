package ropero.estadosDeLaPrenda;

import ropero.Prenda;

public class Limpio extends EstadoPrenda {

    public Limpio() {
        descripcion = DescripcionEstadoPrenda.LIMPIO;
    }

    @Override
    public void usar(Prenda prenda) {
        if (usos++ > 2) prenda.actualizarEstado(new Sucio());
    }

    @Override
    public boolean sePuedeUsar() {
        return true;
    }
}
