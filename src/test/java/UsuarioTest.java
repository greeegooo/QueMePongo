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
        Prenda zapato = new Prenda(new Tipo(Categoria.CALZADO), Material.CUERO, new Color(0, 0, 0));
        Prenda camisa = new Prenda(new Tipo(Categoria.SUPERIOR), Material.ALGODON, new Color(255, 0, 0));
        Prenda panueloVerde = new Prenda(new Tipo(Categoria.ACCESORIO), Material.CUERO, new Color(255, 0, 0));
        Prenda pantalon = new Prenda(new Tipo(Categoria.INFERIOR), Material.PLASTICO, new Color(255, 255, 255));

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