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

    public List<Atuendo> sugerencias(boolean conAccesorios) {

        Set<List<Prenda>> productoCartesiano;

        if (conAccesorios) {
            productoCartesiano = Sets.cartesianProduct(
                    new HashSet<>(obtenerPrendas(Categoria.SUPERIOR)),
                    new HashSet<>(obtenerPrendas(Categoria.INFERIOR)),
                    new HashSet<>(obtenerPrendas(Categoria.CALZADO)),
                    new HashSet<>(obtenerPrendas(Categoria.ACCESORIO))
            );
        }
        else {
            productoCartesiano = Sets.cartesianProduct(
                    new HashSet<>(obtenerPrendas(Categoria.SUPERIOR)),
                    new HashSet<>(obtenerPrendas(Categoria.INFERIOR)),
                    new HashSet<>(obtenerPrendas(Categoria.CALZADO))
            );
        }

        return productoCartesiano
            .stream()
            .map(prendas -> this.crearAtuendo(prendas, conAccesorios))
            .collect(Collectors.toList());
    }

    private Atuendo crearAtuendo(List<Prenda> prendas, boolean conAccesorio) {
        Atuendo atuendo = new Atuendo(prendas.get(0), prendas.get(1), prendas.get(2));
        if (conAccesorio) {
            atuendo.setAccesorio(prendas.get(3));
        }
        return atuendo;
    }

    private List<Prenda> obtenerPrendas(Categoria categoria) {
        return prendas.stream()
            .filter(atuendo -> atuendo.getCategoria() == categoria)
            .collect(Collectors.toList());
    }
}