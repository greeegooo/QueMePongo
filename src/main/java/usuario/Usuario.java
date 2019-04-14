package usuario;

import ropero.Atuendo;
import java.util.LinkedList;
import java.util.List;

public class Usuario {
    private Atuendo atuendo;
    private List<Guardarropas> listaGuardarropas = new LinkedList<>();

    public Usuario(Atuendo atuendo){
        this.atuendo = atuendo;
    }

    public Atuendo getAtuendo() {
        return atuendo;
    }

    public void setAtuendo(Atuendo atuendo) {
        this.atuendo = atuendo;
    }

    public List<Guardarropas> getListaGuardarropas() {
        return listaGuardarropas;
    }

    public void crearGuardarropa(){
        Guardarropas guardarropas = new Guardarropas();
        listaGuardarropas.add(guardarropas);
    }

    private List<Atuendo> queMePongo(){
        List<Atuendo> sugerenciaDeAtuendos = new LinkedList<>();
        for (Guardarropas guardarropa : listaGuardarropas){
            List<Atuendo> sugerencia = guardarropa.sugerencias();
            sugerenciaDeAtuendos.addAll(sugerencia);
        }
        return sugerenciaDeAtuendos;
    }

}
