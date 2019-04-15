package ropero;

import excepciones.PrendaException;
import org.junit.Before;
import org.junit.Test;
import ropero.caracteristicasDeLaPrenda.*;

import static org.junit.Assert.*;

public class PrendaBuilderTest {

    private Color testColor = new Color(0, 0, 0);
    private Material testMaterial = Material.CUERO;
    private Categoria testCategoria = Categoria.INFERIOR;
    private Tipo testTipo = new Tipo(testCategoria);
    private String testDesc = "TestPrenda";
    private PrendaBuilder builder = new PrendaBuilder();

    @Before
    public void init() {
        builder
        .setDescripcion(testDesc)
        .setColorPrimario(testColor)
        .setMaterial(testMaterial)
        .setTipo(testTipo)
        .setColorPrimario(testColor);
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

    @Test(expected = PrendaException.class)
    public void crearUnaPrendaConColoresIguales_Deberia_Fallar() {
        Color colorPrimario = new Color(50, 50, 50);
        Color colorSecundario = new Color(50, 50, 50);
        ;
        builder.setColorPrimario(colorPrimario);
        builder.setColorSecundario(colorSecundario);

        Prenda prenda = builder.build();
    }

    @Test
    public void crearUnaPrendaConUnColor() {
        Color colorPrimario = new Color(50, 50, 50);
        builder.setColorPrimario(colorPrimario);

        Prenda prenda = builder.build();

        assertFalse(colorPrimario.equals(null));
    }
}