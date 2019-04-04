import org.junit.Before;
import org.junit.Test;
import ropero.Prenda;
import ropero.caracteristicasDeLaPrenda.Categoria;
import ropero.caracteristicasDeLaPrenda.Color;
import ropero.caracteristicasDeLaPrenda.Material;
import ropero.caracteristicasDeLaPrenda.Tipo;

import java.util.Collection;

import static org.junit.Assert.*;

public class PrendaTest {

    public Prenda prenda;

    @Before
    public void init(){}

    @Test
    public void unCollar_DeberiaSer_CategoriaAccesorio(){
        Prenda collar = new Prenda(new Tipo(Categoria.ACCESORIO), Material.ALGODON, new Color(255, 0,0));
        assertSame(collar.tipo.getCategoria(), Categoria.ACCESORIO);
    }

    @Test
    public void unPantalon_NoDeberiaSer_CategoriaAccesorio(){
        Prenda pantalon = new Prenda(new Tipo(Categoria.INFERIOR),null,null);
        assertFalse(pantalon.tipo.getCategoria() == Categoria.ACCESORIO);
    }

    @Test
    public void unCamisa_Deberia_SerDe(){
        Prenda camisa = new Prenda(new Tipo(Categoria.ACCESORIO), null, null);
    }

    @Test
    public void unasZapatillas_Deberia_SerUnCalzado(){
        Prenda nuevaPrenda = new Prenda(new Tipo(Categoria.ACCESORIO), null, null);
    }
}