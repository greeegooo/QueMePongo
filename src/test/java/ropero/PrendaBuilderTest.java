package ropero;

import excepciones.PrendaException;
import org.junit.Before;
import org.junit.Test;
import ropero.caracteristicasDeLaPrenda.Categoria;
import ropero.caracteristicasDeLaPrenda.Color;
import ropero.caracteristicasDeLaPrenda.Material;
import ropero.caracteristicasDeLaPrenda.Tipo;

import static org.junit.Assert.*;

public class PrendaBuilderTest {

    private Color testColor = new Color(0,0,0);
    private Material testMaterial = Material.CUERO;
    private Categoria testCategoria = Categoria.INFERIOR;
    private Tipo testTipo = new Tipo(testCategoria);
    private String testDesc = "TestPrenda";
    private PrendaBuilder builder = new PrendaBuilder();

    @Before
    public void init(){
        builder.setDescripcion(testDesc);
        builder.setColorPrimario(testColor);
        builder.setMaterial(testMaterial);
        builder.setTipo(testTipo);
        builder.setColorPrimario(testColor);
        builder.setColorSecundario(testColor);
    }

    @Test
    public void unCollar_DeberiaSer_CategoriaAccesorio() {

        Tipo tipoCollar = new Tipo(Categoria.ACCESORIO);
        builder.setTipo(tipoCollar);

        Prenda collar = builder.build();

        assertSame(collar.getTipo().getCategoria(), Categoria.ACCESORIO);
    }

    @Test
    public void unPantalon_NoDeberiaSer_CategoriaAccesorio() {

        Tipo tipoPantalon = new Tipo(Categoria.INFERIOR);
        builder.setTipo(tipoPantalon);

        Prenda pantalon = builder.build();

        assertFalse(pantalon.getTipo().getCategoria() == Categoria.ACCESORIO);
    }

    @Test(expected = PrendaException.class)
    public void crearUnaPrendaSinMaterial_Deberia_Fallar() {

        builder.setMaterial(null);
        Prenda prenda = builder.build();
    }
}