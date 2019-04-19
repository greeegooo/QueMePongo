package usuario;

import ropero.Atuendo;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Usuario {

    private List<Guardarropa> guardarropas = new LinkedList<>();

    private Usuario(){}

    public List<Guardarropa> getGuardarropas() {
        return guardarropas;
    }

    public void agregarGuardarropa(Guardarropa guardarropa){
        guardarropas.add(guardarropa);
    }

    private List<Atuendo> queMePongo(boolean conAccesorios) {
        return guardarropas.stream()
            .map(g -> g.sugerencias(conAccesorios))
            .flatMap(List::stream)
            .collect(Collectors.toList());
    }
}
