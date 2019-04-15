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

    @Before
    public void setUp() {

        builder
        .setDescripcion(testDesc)
        .setColorPrimario(testColor)
        .setMaterial(testMaterial)
        .setTipo(testTipo)
        .setColorPrimario(testColor);

        this.zapatos = builder.setDescripcion("ZapatosTest").setTipo(new Tipo(Categoria.CALZADO)).build();
        this.ojotas = builder.setDescripcion("OjotasTest").setTipo(new Tipo(Categoria.CALZADO)).build();
        this.camisa = builder.setDescripcion("CamisaTest").setTipo(new Tipo(Categoria.SUPERIOR)).build();
        this.chomba = builder.setDescripcion("ChombaTest").setTipo(new Tipo(Categoria.SUPERIOR)).build();
        this.pantalon = builder.setDescripcion("PantalonTest").setTipo(new Tipo(Categoria.INFERIOR)).build();
        this.shorts = builder.setDescripcion("ShortsTest").setTipo(new Tipo(Categoria.INFERIOR)).build();

        List<Prenda> prendas = new LinkedList();
        Collections.addAll(prendas, this.camisa, this.chomba, this.shorts, this.pantalon, this.zapatos, this.ojotas);
        prendas.forEach(prenda -> this.guardarropas.agregarPrenda(prenda));
    }

    @Test
    public void ObtenerSugerencias(){

        List<Atuendo> atuendos = this.guardarropas.sugerencias();
        assertEquals(atuendos.size(), 8);

        /*
        Atuendo atuendo1 = atuendos.get(0);
        Atuendo atuendo2 = atuendos.get(1);
        Atuendo atuendo3 = atuendos.get(2);
        Atuendo atuendo4 = atuendos.get(3);
        Atuendo atuendo5 = atuendos.get(4);
        Atuendo atuendo6 = atuendos.get(5);
        Atuendo atuendo7 = atuendos.get(6);
        Atuendo atuendo8 = atuendos.get(7);

        assertEquals(atuendo1.getPrendaSuperior(), this.camisa);
        assertEquals(atuendo1.getPrendaInferior(), this.shorts);
        assertEquals(atuendo1.getCalzado(), this.zapatos);

        assertEquals(atuendo2.getPrendaSuperior(), this.camisa);
        assertEquals(atuendo2.getPrendaInferior(), this.shorts);
        assertEquals(atuendo2.getCalzado(), this.ojotas);

        assertEquals(atuendo3.getPrendaSuperior(), this.camisa);
        assertEquals(atuendo3.getPrendaInferior(), this.pantalon);
        assertEquals(atuendo3.getCalzado(), this.zapatos);

        assertEquals(atuendo4.getPrendaSuperior(), this.camisa);
        assertEquals(atuendo4.getPrendaInferior(), this.pantalon);
        assertEquals(atuendo4.getCalzado(), this.zapatos);

        assertEquals(atuendo5.getPrendaSuperior(), this.chomba);
        assertEquals(atuendo5.getPrendaInferior(), this.shorts);
        assertEquals(atuendo5.getCalzado(), this.zapatos);

        assertEquals(atuendo6.getPrendaSuperior(), this.chomba);
        assertEquals(atuendo6.getPrendaInferior(), this.shorts);
        assertEquals(atuendo6.getCalzado(), this.ojotas);

        assertEquals(atuendo7.getPrendaSuperior(), this.chomba);
        assertEquals(atuendo7.getPrendaInferior(), this.pantalon);
        assertEquals(atuendo7.getCalzado(), this.zapatos);

        assertEquals(atuendo8.getPrendaSuperior(), this.chomba);
        assertEquals(atuendo8.getPrendaInferior(), this.pantalon);
        assertEquals(atuendo8.getCalzado(), this.ojotas);
        */
    }
}