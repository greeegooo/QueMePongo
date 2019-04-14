package usuario;

import com.google.common.collect.Sets;
import ropero.Atuendo;
import ropero.Prenda;
import ropero.caracteristicasDeLaPrenda.Categoria;

import java.util.*;
import java.util.stream.Collectors;

public class Guardarropas {
    private List<Prenda> prendas;

    public Guardarropas() {
        this.prendas = new ArrayList<>();
    }

    public void agregarPrenda(Prenda prenda) {
        if (!this.prendas.contains(prenda)) {
            this.prendas.add(prenda);
        }
    }

    public void eliminarPrenda(Prenda prenda) {
        this.prendas.remove(prenda);
    }

    public List<Atuendo> sugerencias() {
          return Sets.cartesianProduct(this.obtenerSetPrendasPorCategoria(Categoria.SUPERIOR),
                  this.obtenerSetPrendasPorCategoria(Categoria.INFERIOR),
                  this.obtenerSetPrendasPorCategoria(Categoria.CALZADO),
                  this.obtenerSetPrendasPorCategoria(Categoria.ACCESORIO))
                .stream()
                .flatMap(listasPrenda -> listasPrenda.stream())
                .map(listaPrenda -> this.crearAtuendo(listaPrenda))
                .collect(Collectors.toList());
    }

    public List<Prenda> obtenerPrendas(Categoria categoria) {
        return this.prendas
                .stream()
                .filter(atuendo -> atuendo.getCategoria() == categoria)
                .collect(Collectors.toList());
    }

    private Atuendo crearAtuendo(List<Prenda> prendas) {
        boolean poseeAccesorio = prendas.stream().anyMatch(prenda -> prenda.getCategoria() == Categoria.CALZADO);
        return new Atuendo(this.obtenerPrenda(prendas, Categoria.SUPERIOR), this.obtenerPrenda(prendas, Categoria.INFERIOR), this.obtenerPrenda(prendas, Categoria.CALZADO));
    }

    private Prenda obtenerPrenda(List<Prenda> prendas, Categoria categoria) {
        return prendas.stream()
                .filter(p -> p.getCategoria() == categoria)
                .findFirst().get();
    }

    private Set<List<Prenda>> obtenerSetPrendasPorCategoria(Categoria categoria) {
        Set<List<Prenda>> setPrendas = new HashSet<>();
        setPrendas.add(this.obtenerPrendas(categoria));
        return setPrendas;
    }
}