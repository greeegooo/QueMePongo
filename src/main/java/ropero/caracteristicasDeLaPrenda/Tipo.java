package ropero.caracteristicasDeLaPrenda;

public class Tipo {
    private Categoria categoria;

    public Tipo(Categoria categoria){
        this.categoria = categoria;
    }

    public Categoria getCategoria(){
        return this.categoria;
    }
}
