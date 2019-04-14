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
            new HashSet<>(obtenerPrendas(Categoria.SUPERIOR)),
            new HashSet<>(obtenerPrendas(Categoria.INFERIOR)),
            new HashSet<>(obtenerPrendas(Categoria.CALZADO))
        );

        return productoCartesiano
            .stream()
            .map(s -> new Atuendo(s.get(0), s.get(1), s.get(2)))
            .collect(Collectors.toList());
    }

    public List<Prenda> obtenerPrendas(Categoria categoria) {
        return prendas.stream()
            .filter(atuendo -> atuendo.getCategoria() == categoria)
            .collect(Collectors.toList());
    }
}