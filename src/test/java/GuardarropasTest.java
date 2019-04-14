import org.junit.Before;
import org.junit.Test;
import ropero.Atuendo;
import ropero.Prenda;
import ropero.caracteristicasDeLaPrenda.Categoria;
import ropero.caracteristicasDeLaPrenda.Color;
import ropero.caracteristicasDeLaPrenda.Material;
import ropero.caracteristicasDeLaPrenda.Tipo;
import usuario.Guardarropas;
import usuario.Usuario;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class GuardarropasTest {
        private Guardarropas guardarropas = new Guardarropas();
        private Prenda camisa;
        private Prenda chomba;
        private Prenda pantalon;
        private Prenda shorts;
        private Prenda zapatos;
        private Prenda ojotas;

        @Before
        public void init(){
            this.zapatos = new Prenda("Zapatos", new Tipo(Categoria.CALZADO), Material.CUERO, new Color(0, 0, 0));
            this.ojotas = new Prenda("Ojotas", new Tipo(Categoria.CALZADO), Material.CUERO, new Color(0, 0, 0));
            this.camisa = new Prenda("Camisa", new Tipo(Categoria.SUPERIOR), Material.ALGODON, new Color(255, 0, 0));
            this.chomba = new Prenda("Chomba", new Tipo(Categoria.SUPERIOR), Material.ALGODON, new Color(255, 0, 0));
            this.pantalon = new Prenda("Pantalon", new Tipo(Categoria.INFERIOR), Material.PLASTICO, new Color(255, 255, 255));
            this.shorts = new Prenda("Shorts", new Tipo(Categoria.INFERIOR), Material.PLASTICO, new Color(255, 255, 255));


            List<Prenda> prendas = new LinkedList();
            Collections.addAll(prendas, this.camisa, this.chomba, this.shorts, this.pantalon, this.zapatos, this.ojotas);
            prendas.forEach(prenda -> {
                this.guardarropas.agregarPrenda(prenda);
            });
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

