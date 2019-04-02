import org.junit.Test;

import static org.junit.Assert.*;

public class PrendaTest {

    @Test
    public void nuevaPrenda(){

        Prenda zapato = new Prenda(Tipo.ZAPATOS, new Color(255, 0, 0), Material.CUERO);

    }
}