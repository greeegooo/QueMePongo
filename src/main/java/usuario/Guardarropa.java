package usuario;

import com.google.common.collect.Sets;
import ropero.Atuendo;
import ropero.Prenda;
import ropero.caracteristicasDeLaPrenda.Categoria;

import java.util.*;
import java.util.stream.Collectors;

public class Guardarropa {

    private List<Prenda> prendas = new ArrayList<>();

    public void agregarPrenda(Prenda prenda) {
        this.prendas.add(prenda);
    }

    public List<Atuendo> sugerencias() {

        Set<List<Prenda>> productoCartesiano = Sets.cartesianProduct(
            new HashSet<>(obtenerPrendasUsables(Categoria.SUPERIOR)),
            new HashSet<>(obtenerPrendasUsables(Categoria.INFERIOR)),
            new HashSet<>(obtenerPrendasUsables(Categoria.CALZADO))
        );

        return productoCartesiano
            .stream().map(sugerencia -> armarAtuendo(sugerencia))
            .collect(Collectors.toList());
    }

    public List<Prenda> obtenerPrendasUsables(Categoria categoria) {

        return obtenerPrendas(categoria)
            .stream().filter(prenda -> prenda.sePuedeUsar())
            .collect(Collectors.toList());
    }

    public List<Prenda> obtenerPrendas(Categoria categoria) {

        return prendas
            .stream().filter(atuendo -> atuendo.getCategoria() == categoria)
            .collect(Collectors.toList());
    }

    private Atuendo armarAtuendo(List<Prenda> sugerencia) {

        sugerencia.forEach(prenda -> prenda.usar());
        return new Atuendo(sugerencia.get(0), sugerencia.get(1), sugerencia.get(2));
    }
}