package uniforme;

import ropero.BorradorPrenda;
import ropero.Prenda;
import ropero.caracteristicasDeLaPrenda.Categoria;
import ropero.caracteristicasDeLaPrenda.Color;
import ropero.caracteristicasDeLaPrenda.Material;
import ropero.caracteristicasDeLaPrenda.Tipo;

public class SastreSanJuan extends Sastre {

    @Override
    public Prenda CrearPrendaSuperior() {

        borradorPrenda
        .setTipo(new Tipo(Categoria.SUPERIOR))
        .setColorPrimario(new Color(0,255,0))
        .setDescripcion("Chomba del Colegio SanJuan")
        .setMaterial(Material.PIQUE);

        return borradorPrenda.build();
    }

    @Override
    public Prenda CrearPrendaInferior() {

        borradorPrenda
        .setTipo(new Tipo(Categoria.INFERIOR))
        .setColorPrimario(new Color(0,0,0))
        .setDescripcion("Pantalón del Colegio SanJuan")
        .setMaterial(Material.ACETATO);

        return borradorPrenda.build();
    }

    @Override
    public Prenda CrearCalzado() {

        borradorPrenda
        .setTipo(new Tipo(Categoria.CALZADO))
        .setColorPrimario(new Color(0,0,0))
        .setDescripcion("Zapatillas del Colegio SanJuan")
        .setMaterial(Material.CUERO);

        return borradorPrenda.build();
    }
}
