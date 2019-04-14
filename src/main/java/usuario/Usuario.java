package usuario;

import ropero.Atuendo;
import java.util.LinkedList;
import java.util.List;

public class Usuario {

    private List<Guardarropa> guardarropas = new LinkedList<>();

    private Usuario(){}

    public List<Guardarropa> getGuardarropas() {
        return guardarropas;
    }

    public void agregarGuardarropa(Guardarropa guardarropa){
        guardarropas.add(guardarropa);
    }

    private List<Atuendo> queMePongo(){
        List<Atuendo> sugerenciaDeAtuendos = new LinkedList<>();
        for (Guardarropa guardarropa : guardarropas){
            List<Atuendo> sugerencia = guardarropa.sugerencias();
            sugerenciaDeAtuendos.addAll(sugerencia);
        }
        return sugerenciaDeAtuendos;
    }
}
