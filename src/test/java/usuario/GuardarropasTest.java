package usuario;

import org.junit.Before;
import org.junit.Test;
import ropero.Atuendo;
import ropero.Prenda;
import ropero.PrendaBuilder;
import ropero.caracteristicasDeLaPrenda.Categoria;
import ropero.caracteristicasDeLaPrenda.Color;
import ropero.caracteristicasDeLaPrenda.Material;
import ropero.caracteristicasDeLaPrenda.Tipo;

import java.util.List;

import static org.junit.Assert.*;

public class GuardarropasTest {

    private Color testColor = new Color(0,0,0);
    private Material testMaterial = Material.CUERO;
    private Categoria testCategoria = Categoria.INFERIOR;
    private Tipo testTipo = new Tipo(testCategoria);
    private String testDesc = "TestPrenda";
    private PrendaBuilder builder = new PrendaBuilder();

    @Before
    public void setUp() {
        builder
        .setDescripcion(testDesc)
        .setColorPrimario(testColor)
        .setMaterial(testMaterial)
        .setTipo(testTipo)
        .setColorPrimario(testColor)
        .setColorSecundario(testColor);
    }

    @Test
    public void sugerencias() {

        Prenda remera1 = builder.setTipo(new Tipo(Categoria.SUPERIOR)).build();
        Prenda remera2 = builder.setTipo(new Tipo(Categoria.SUPERIOR)).build();
        Prenda pantalon1 = builder.setTipo(new Tipo(Categoria.INFERIOR)).build();
        Prenda pantalon2 = builder.setTipo(new Tipo(Categoria.INFERIOR)).build();
        Prenda calzado1 = builder.setTipo(new Tipo(Categoria.CALZADO)).build();
        Prenda calzado2 = builder.setTipo(new Tipo(Categoria.CALZADO)).build();

        Guardarropas guardarropas = new Guardarropas();
        guardarropas.agregarPrenda(remera1);
        guardarropas.agregarPrenda(remera2);
        guardarropas.agregarPrenda(pantalon1);
        guardarropas.agregarPrenda(pantalon2);
        guardarropas.agregarPrenda(calzado1);
        guardarropas.agregarPrenda(calzado2);

        List<Atuendo> sugerencias = guardarropas.sugerencias();

        Atuendo sugerencia1 = sugerencias.get(0);

        assertNotNull(sugerencia1);
    }
}