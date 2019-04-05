import excepciones.PrendaException;
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

    public Color testColor = new Color(0,0,0);
    public Material testMaterial = Material.CUERO;
    public Categoria testCategoria = Categoria.INFERIOR;
    public Tipo testTipo = new Tipo(testCategoria);

    @Before
    public void init(){}

    @Test
    public void unCollar_DeberiaSer_CategoriaAccesorio(){
        Prenda collar = new Prenda(new Tipo(Categoria.ACCESORIO), testMaterial, testColor);
        assertSame(collar.getTipo().getCategoria(), Categoria.INFERIOR);
    }

    @Test
    public void unPantalon_NoDeberiaSer_CategoriaAccesorio(){
        Prenda pantalon = new Prenda(new Tipo(Categoria.INFERIOR), testMaterial, testColor);
        assertFalse(pantalon.getTipo().getCategoria() == Categoria.ACCESORIO);
    }

    @Test(expected = PrendaException.class)
    public void crearUnaPrendaSinMaterial_Deberia_Fallar(){
        new Prenda(new Tipo(Categoria.ACCESORIO), null, testColor);
    }
}