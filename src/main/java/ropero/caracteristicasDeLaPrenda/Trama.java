package ropero.caracteristicasDeLaPrenda;

import java.util.ArrayList;
import java.util.List;

public enum Trama {
    CUADROS(new ArrayList<Material>() {{
        add(Material.ALGODON);
    }}),
    ESTAMPADO(new ArrayList<Material>() {{
        add(Material.ALGODON);
    }}),
    LISA(new ArrayList<Material>() {{
        add(Material.ALGODON);
        add(Material.PLASTICO);
        add(Material.CUERO);
        add(Material.LANA);
    }}),
    LUNARES(new ArrayList<Material>() {{
        add(Material.CUERO);
    }}),
    RAYADA(new ArrayList<Material>() {{
        add(Material.PLASTICO);
        add(Material.LANA);
    }});

    private List<Material> materialesValidos;

    Trama(List<Material> materialesValidos) {
        this.materialesValidos = materialesValidos;
    }

    public boolean esValido(Material material) {
        return this.materialesValidos.contains(material);
    }
}
