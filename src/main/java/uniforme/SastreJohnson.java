package uniforme;

import ropero.Prenda;
import ropero.caracteristicasDeLaPrenda.Categoria;
import ropero.caracteristicasDeLaPrenda.Color;
import ropero.caracteristicasDeLaPrenda.Material;
import ropero.caracteristicasDeLaPrenda.Tipo;

public class SastreJohnson extends Sastre{

    @Override
    public Prenda CrearPrendaSuperior() {

        borradorPrenda
        .setTipo(new Tipo(Categoria.SUPERIOR))
        .setDescripcion("Camisa del Instituto Johnson")
        .setMaterial(Material.ALGODON)
        .setColorPrimario(new Color(255,255,255));

        return borradorPrenda.build();
    }

    @Override
    public Prenda CrearPrendaInferior() {

        borradorPrenda
        .setTipo(new Tipo(Categoria.INFERIOR))
        .setDescripcion("Pantalón del Instituto Johnson")
        .setMaterial(Material.ACETATO)
        .setColorPrimario(new Color(0,0,0));

        return borradorPrenda.build();
    }

    @Override
    public Prenda CrearCalzado() {

        return this.crearParte(
            new Tipo(Categoria.CALZADO),
            "Zapatillas del Instituto Johnson",
            Material.CUERO,
            new Color(0,0,0));
    }

    private Prenda crearParte(Tipo tipo, String descripcion, Material material, Color color){

        borradorPrenda
        .setTipo(new Tipo(Categoria.CALZADO))
        .setDescripcion("Zapatillas del Instituto Johnson")
        .setMaterial(Material.CUERO)
        .setColorPrimario(new Color(0,0,0));

        return borradorPrenda.build();
    }
}
