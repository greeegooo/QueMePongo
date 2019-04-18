package ropero.estadosDeLaPrenda;

import ropero.Prenda;

public abstract class EstadoPrenda {
    protected int usos = 0;
    protected String descripcion;

    public abstract void usar(Prenda prenda);
    public abstract boolean sePuedeUsar();
}
