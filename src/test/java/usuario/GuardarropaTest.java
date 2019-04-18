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

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class GuardarropaTest {

    private Color testColor = new Color(0, 0, 0);
    private Material testMaterial = Material.CUERO;
    private Categoria testCategoria = Categoria.INFERIOR;
    private Tipo testTipo = new Tipo(testCategoria);
    private String testDesc = "TestPrenda";
    private PrendaBuilder builder = new PrendaBuilder();
    private Guardarropa guardarropas = new Guardarropa();

    private Prenda camisa;
    private Prenda chomba;
    private Prenda pantalon;
    private Prenda shorts;
    private Prenda zapatos;
    private Prenda ojotas;
    private Prenda bufanda;
    private Prenda anteojos;

    @Before
    public void setUp() {

        builder.setDescripcion(testDesc).setColorPrimario(testColor).setMaterial(testMaterial).setTipo(testTipo);

        this.zapatos = builder.setDescripcion("ZapatosTest").setTipo(new Tipo(Categoria.CALZADO)).build();
        this.ojotas = builder.setDescripcion("OjotasTest").setTipo(new Tipo(Categoria.CALZADO)).build();
        this.camisa = builder.setDescripcion("CamisaTest").setTipo(new Tipo(Categoria.SUPERIOR)).build();
        this.chomba = builder.setDescripcion("ChombaTest").setTipo(new Tipo(Categoria.SUPERIOR)).build();
        this.pantalon = builder.setDescripcion("PantalonTest").setTipo(new Tipo(Categoria.INFERIOR)).build();
        this.shorts = builder.setDescripcion("ShortsTest").setTipo(new Tipo(Categoria.INFERIOR)).build();
        this.anteojos = builder.setDescripcion("AnteojosTest").setTipo(new Tipo(Categoria.ACCESORIO)).build();
        this.bufanda = builder.setDescripcion("BufandaTest").setTipo(new Tipo(Categoria.ACCESORIO)).build();
    }

    @Test
    public void ObtenerSugerencias() {
        //Setup
        List<Prenda> prendas = new LinkedList();
        Collections.addAll(prendas,
                this.camisa, this.chomba,
                this.shorts, this.pantalon,
                this.zapatos, this.ojotas,
                this.bufanda, this.anteojos);
        prendas.forEach(prenda -> this.guardarropas.agregarPrenda(prenda));

        //Test
        List<Atuendo> atuendos = this.guardarropas.sugerencias();

        //Assert
        assertEquals(atuendos.size(), 16);
    }
}