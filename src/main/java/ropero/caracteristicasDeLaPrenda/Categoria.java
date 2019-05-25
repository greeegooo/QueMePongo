package ropero.caracteristicasDeLaPrenda;

import java.util.ArrayList;
import java.util.List;

public enum Categoria {
    ACCESORIO(new ArrayList<Material>() {{
        add(Material.PLASTICO);
        add(Material.CUERO);
    }}),
    CALZADO(new ArrayList<Material>() {{
        add(Material.CUERO);
        add(Material.PLASTICO);
    }}),
    INFERIOR(new ArrayList<Material>() {{
        add(Material.LANA);
        add(Material.CUERO);
        add(Material.PLASTICO);
        add(Material.ALGODON);
    }}),
    SUPERIOR(new ArrayList<Material>() {{
        add(Material.LANA);
        add(Material.CUERO);
        add(Material.PLASTICO);
        add(Material.ALGODON);
    }});

    Categoria(List<Material> materialesValidos) {
        this.materialesValidos = materialesValidos;
    }

    public boolean esValido(Material material) {
        return this.materialesValidos.contains(material);
    }

    private List<Material> materialesValidos;
}
