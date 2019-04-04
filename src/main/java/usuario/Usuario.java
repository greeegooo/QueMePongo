package usuario;

import ropero.Atuendo;

public class Usuario {
    private Atuendo atuendo;

    public Usuario(Atuendo atuendo){
        this.atuendo = atuendo;
    }

    public Atuendo getAtuendo(){
        return this.atuendo;
    }
}
