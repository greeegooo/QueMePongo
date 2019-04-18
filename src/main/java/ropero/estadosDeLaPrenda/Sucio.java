package ropero.estadosDeLaPrenda;

import ropero.Prenda;

public class Sucio extends EstadoPrenda {

    public Sucio(){
        descripcion = DescripcionEstadoPrenda.SUCIO;
    }

    @Override
    public void usar(Prenda prenda) {
        if(usos++ > 3) prenda.actualizarEstado(new Percudido());
    }

    @Override
    public boolean sePuedeUsar() {
        return true;
    }
}
