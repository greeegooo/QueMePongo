package usuario;

import com.google.common.collect.Sets;
import ropero.Atuendo;
import ropero.Prenda;
import ropero.caracteristicasDeLaPrenda.Categoria;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Guardarropa {

    private List<Prenda> prendas = new ArrayList<>();

    public void agregarPrenda(Prenda prenda) {
        this.prendas.add(prenda);
    }

    public Stream<Atuendo> sugerencias() {

        Set<List<Prenda>> productoCartesianoSinAccesorios = Collections.emptySet();
        Set<List<Prenda>> productoCartesianoConAccesorios = Collections.emptySet();

        Map<Categoria, Set<Prenda>> prendasPorCategoria = this.prendas.stream().collect(
                Collectors.groupingBy(Prenda::getCategoria, Collectors.toSet())
        );

            if (this.formanAtuendo(prendasPorCategoria.keySet())) {
                productoCartesianoSinAccesorios = Sets.cartesianProduct(
                        prendasPorCategoria.get(Categoria.SUPERIOR),
                        prendasPorCategoria.get(Categoria.INFERIOR),
                        prendasPorCategoria.get(Categoria.CALZADO)
                );
            }

            if (prendasPorCategoria.size() == 4) {
                productoCartesianoConAccesorios = Sets.cartesianProduct(
                        prendasPorCategoria.get(Categoria.SUPERIOR),
                        prendasPorCategoria.get(Categoria.INFERIOR),
                        prendasPorCategoria.get(Categoria.CALZADO),
                        prendasPorCategoria.get(Categoria.ACCESORIO));
            }

        return combinacionSugerencias(productoCartesianoSinAccesorios, productoCartesianoConAccesorios);
    }

    private Stream<Atuendo> combinacionSugerencias(Set<List<Prenda>> productoCartesianoSinAccesorios, Set<List<Prenda>> productoCartesianoConAccesorios) {
        return Stream.concat(this.convertirPrendasEnAtuendos(productoCartesianoSinAccesorios, false),
                this.convertirPrendasEnAtuendos(productoCartesianoConAccesorios, true));
    }

    private Stream<Atuendo> convertirPrendasEnAtuendos(Set<List<Prenda>> productoCartesianoPrendas, boolean conAccesorio) {
        return productoCartesianoPrendas
            .stream()
            .map(prendas -> this.crearAtuendo(prendas, conAccesorio));
    }

    private Atuendo crearAtuendo(List<Prenda> prendas, boolean conAccesorio) {
        Atuendo atuendo = new Atuendo(prendas.get(0), prendas.get(1), prendas.get(2));
        if (conAccesorio) {
            atuendo.setAccesorio(prendas.get(3));
        }
        return atuendo;
    }

    private boolean formanAtuendo(Set<Categoria> categorias) {
        return categorias.contains(Categoria.SUPERIOR)
            && categorias.contains(Categoria.INFERIOR)
            && categorias.contains(Categoria.CALZADO);
    }
}