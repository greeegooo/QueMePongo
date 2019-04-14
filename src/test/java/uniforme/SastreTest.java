package uniforme;

import org.junit.Before;
import org.junit.Test;
import ropero.Prenda;
import ropero.caracteristicasDeLaPrenda.Categoria;
import ropero.caracteristicasDeLaPrenda.Color;
import ropero.caracteristicasDeLaPrenda.Material;

import static org.junit.Assert.*;

public class SastreTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void crearUniforme_ColegioSanJuan(){

        Sastre sastre = new SastreSanJuan();

        Uniforme uniformeColegioSanjuan = new Uniforme();

        uniformeColegioSanjuan.ParteSuperior = sastre.CrearPrendaSuperior();
        uniformeColegioSanjuan.ParteInferior = sastre.CrearPrendaInferior();
        uniformeColegioSanjuan.Calzado = sastre.CrearCalzado();

        assertNotNull(uniformeColegioSanjuan);
        assertNotNull(uniformeColegioSanjuan.ParteSuperior);
        assertNotNull(uniformeColegioSanjuan.ParteInferior);
        assertNotNull(uniformeColegioSanjuan.Calzado);
    }

    @Test
    public void laChombaDelSanJuan_SeCreaCorrectamente(){

        Sastre sastre = new SastreSanJuan();

        Prenda chomba = sastre.CrearPrendaSuperior();

        assertSame(chomba.getTipo().getCategoria(), Categoria.SUPERIOR);
        assert(chomba.getColorPrimario().green, 255);
        assertSame(chomba.getMaterial(), Material.PIQUE);
        assertSame(chomba.getDescripcion(), "Chomba del Colegio SanJuan");
    }

    @Test
    public void crearUniforme_InstitutoJohnson(){

        Sastre sastre = new SastreJohnson();

        Uniforme uniformeInstitutoJohnson = new Uniforme();

        uniformeInstitutoJohnson.ParteSuperior = sastre.CrearPrendaSuperior();
        uniformeInstitutoJohnson.ParteInferior = sastre.CrearPrendaInferior();
        uniformeInstitutoJohnson.Calzado = sastre.CrearCalzado();

        assertNotNull(uniformeInstitutoJohnson);
        assertNotNull(uniformeInstitutoJohnson.ParteSuperior);
        assertNotNull(uniformeInstitutoJohnson.ParteInferior);
        assertNotNull(uniformeInstitutoJohnson.Calzado);
    }
}