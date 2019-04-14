import ropero.*;
import ropero.caracteristicasDeLaPrenda.Categoria;
import ropero.caracteristicasDeLaPrenda.Color;
import ropero.caracteristicasDeLaPrenda.Material;
import ropero.caracteristicasDeLaPrenda.Tipo;
import usuario.Usuario;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class UsuarioTest {

    private Prenda prendaSuperior;
    private Prenda prendaInferior;
    private Prenda calzado;

    private Atuendo atuendo = new Atuendo(prendaSuperior, prendaInferior, calzado);

    @Before
    public void init(){
        Prenda zapato = new Prenda("Zapato", new Tipo(Categoria.CALZADO), Material.CUERO, new Color(0, 0, 0));
        Prenda camisa = new Prenda("Camisa", new Tipo(Categoria.SUPERIOR), Material.ALGODON, new Color(255, 0, 0));
        Prenda panueloVerde = new Prenda("Pañuelo Verde", new Tipo(Categoria.ACCESORIO), Material.CUERO, new Color(255, 0, 0));
        Prenda pantalon = new Prenda("Pantalon", new Tipo(Categoria.INFERIOR), Material.PLASTICO, new Color(255, 255, 255));

        List<Prenda> prendas = new LinkedList();
        prendas.add(zapato);
        prendas.add(camisa);
        prendas.add(panueloVerde);
        prendas.add(pantalon);

    }

    @Test
    public void CreateUserTest(){
    }
}