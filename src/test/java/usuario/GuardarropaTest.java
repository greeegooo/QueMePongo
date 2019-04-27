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

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    private Prenda collar;
    private Prenda reloj;
    private ArrayList<Prenda> prendas;
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
        this.collar = builder.setDescripcion("CollarTest").setTipo(new Tipo(Categoria.ACCESORIO)).build();
        this.reloj = builder.setDescripcion("RelojTest").setTipo(new Tipo(Categoria.ACCESORIO)).build();

        this.prendas = new ArrayList<>();
        Collections.addAll(this.prendas, this.camisa, this.chomba, this.shorts, this.pantalon, this.zapatos, this.ojotas, this.collar, this.reloj);
        this.prendas.forEach(prenda -> this.guardarropas.agregarPrenda(prenda));
    }


    @Test
    public void obtener_Sugerencias_Sin_Prendas(){

        this.guardarropas = new Guardarropa();

        List<Atuendo> atuendos = this.guardarropas.sugerencias().collect(Collectors.toList());

        assertEquals(0, atuendos.size());
    }

    @Test
    public void obtener_Sugerencias_Una_Sola_Prenda(){

        this.guardarropas = new Guardarropa();

        this.guardarropas.agregarPrenda(this.camisa);
        this.guardarropas.agregarPrenda(this.pantalon);
        this.guardarropas.agregarPrenda(this.ojotas);

        List<Atuendo> atuendos = this.guardarropas.sugerencias().collect(Collectors.toList());

        assertEquals(1, atuendos.size());
    }

    @Test
    public void obtener_Sugerencias(){

        Atuendo atuendo1 = new Atuendo(this.camisa, this.pantalon, this.ojotas);
        Atuendo atuendo2 = new Atuendo(this.camisa, this.pantalon, this.zapatos);
        Atuendo atuendo3 = new Atuendo(this.camisa, this.shorts, this.ojotas);
        Atuendo atuendo4 = new Atuendo(this.camisa, this.shorts, this.zapatos);
        Atuendo atuendo5 = new Atuendo(this.chomba, this.pantalon, this.ojotas);
        Atuendo atuendo6 = new Atuendo(this.chomba, this.pantalon, this.zapatos);
        Atuendo atuendo7 = new Atuendo(this.chomba, this.shorts, this.ojotas);
        Atuendo atuendo8 = new Atuendo(this.chomba, this.shorts, this.zapatos);

        Atuendo atuendo9 = new Atuendo(this.camisa, this.pantalon, this.ojotas);
        atuendo9.setAccesorio(this.collar);
        Atuendo atuendo10 = new Atuendo(this.camisa, this.pantalon, this.zapatos);
        atuendo10.setAccesorio(this.collar);
        Atuendo atuendo11 = new Atuendo(this.camisa, this.shorts, this.ojotas);
        atuendo11.setAccesorio(this.collar);
        Atuendo atuendo12 = new Atuendo(this.camisa, this.shorts, this.zapatos);
        atuendo12.setAccesorio(this.collar);
        Atuendo atuendo13 = new Atuendo(this.chomba, this.pantalon, this.ojotas);
        atuendo13.setAccesorio(this.collar);
        Atuendo atuendo14 = new Atuendo(this.chomba, this.pantalon, this.zapatos);
        atuendo14.setAccesorio(this.collar);
        Atuendo atuendo15 = new Atuendo(this.chomba, this.shorts, this.ojotas);
        atuendo15.setAccesorio(this.collar);
        Atuendo atuendo16 = new Atuendo(this.chomba, this.shorts, this.zapatos);
        atuendo16.setAccesorio(this.collar);

        Atuendo atuendo17 = new Atuendo(this.camisa, this.pantalon, this.ojotas);
        atuendo17.setAccesorio(this.reloj);
        Atuendo atuendo18 = new Atuendo(this.camisa, this.pantalon, this.zapatos);
        atuendo18.setAccesorio(this.reloj);
        Atuendo atuendo19 = new Atuendo(this.camisa, this.shorts, this.ojotas);
        atuendo19.setAccesorio(this.reloj);
        Atuendo atuendo20 = new Atuendo(this.camisa, this.shorts, this.zapatos);
        atuendo20.setAccesorio(this.reloj);
        Atuendo atuendo21 = new Atuendo(this.chomba, this.pantalon, this.ojotas);
        atuendo21.setAccesorio(this.reloj);
        Atuendo atuendo22 = new Atuendo(this.chomba, this.pantalon, this.zapatos);
        atuendo22.setAccesorio(this.reloj);
        Atuendo atuendo23 = new Atuendo(this.chomba, this.shorts, this.ojotas);
        atuendo23.setAccesorio(this.reloj);
        Atuendo atuendo24 = new Atuendo(this.chomba, this.shorts, this.zapatos);
        atuendo24.setAccesorio(this.reloj);

        List<Atuendo> atuendosEsperados = new ArrayList<>();

        Collections.addAll(atuendosEsperados, atuendo1, atuendo2, atuendo3, atuendo4, atuendo5, atuendo6, atuendo7, atuendo8,
            atuendo9, atuendo10, atuendo11, atuendo12, atuendo13, atuendo14, atuendo15, atuendo16,
            atuendo17, atuendo18, atuendo19, atuendo20, atuendo21, atuendo22, atuendo23, atuendo24);

        List<Atuendo> atuendosSugeridos = this.guardarropas.sugerencias().collect(Collectors.toList());

        assertTrue(atuendosSugeridos.containsAll(atuendosEsperados));

        assertEquals(8, atuendosSugeridos.stream().filter(atuendo -> !atuendo.poseeAccesorio()).count());
        assertEquals(16, atuendosSugeridos.stream().filter(atuendo -> atuendo.poseeAccesorio()).count());
    }

    @Test
    public void obtener_Sugerencias_Sin_Accesorios(){

        this.guardarropas = new Guardarropa();
        this.prendas.stream()
            .filter(prenda -> prenda.getCategoria() != Categoria.ACCESORIO)
            .forEach(prenda -> this.guardarropas.agregarPrenda(prenda));

        Atuendo atuendo1 = new Atuendo(this.camisa, this.pantalon, this.ojotas);
        Atuendo atuendo2 = new Atuendo(this.camisa, this.pantalon, this.zapatos);
        Atuendo atuendo3 = new Atuendo(this.camisa, this.shorts, this.ojotas);
        Atuendo atuendo4 = new Atuendo(this.camisa, this.shorts, this.zapatos);
        Atuendo atuendo5 = new Atuendo(this.chomba, this.pantalon, this.ojotas);
        Atuendo atuendo6 = new Atuendo(this.chomba, this.pantalon, this.zapatos);
        Atuendo atuendo7 = new Atuendo(this.chomba, this.shorts, this.ojotas);
        Atuendo atuendo8 = new Atuendo(this.chomba, this.shorts, this.zapatos);

        List<Atuendo> atuendosEsperados = new ArrayList<>();

        Collections.addAll(atuendosEsperados, atuendo1, atuendo2, atuendo3, atuendo4, atuendo5, atuendo6, atuendo7, atuendo8);

        List<Atuendo> atuendosSugeridos = this.guardarropas.sugerencias().collect(Collectors.toList());

        assertTrue(atuendosSugeridos.containsAll(atuendosEsperados));

        assertEquals(8, atuendosSugeridos.stream().filter(atuendo -> !atuendo.poseeAccesorio()).count());
        assertEquals(0, atuendosSugeridos.stream().filter(atuendo -> atuendo.poseeAccesorio()).count());
    }

}