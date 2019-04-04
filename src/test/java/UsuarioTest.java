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
    public Atuendo atuendo = new Atuendo();

    @Before
    public void init(){
        Prenda zapato = new Prenda(new Tipo(Categoria.CALZADO), new Color(0, 0, 0), Material.CUERO);
        Prenda camisa = new Prenda(new Tipo(Categoria.SUPERIOR), new Color(255, 0, 0), Material.ALGODON);
        Prenda panueloVerde = new Prenda(new Tipo(Categoria.ACCESORIO), new Color(0, 255, 0), Material.CUERO);
        Prenda pantalon = new Prenda(new Tipo(Categoria.INFERIOR), new Color(255, 255, 255), Material.PLASTICO);

        List<Prenda> prendas = new LinkedList<Prenda>();
        prendas.add(zapato);
        prendas.add(camisa);
        prendas.add(panueloVerde);
        prendas.add(pantalon);

        atuendo.prendas = prendas;
    }

    @Test
    public void CreateUserTest(){
        Usuario user = new Usuario(atuendo);
        assertNotNull(user);
    }
}