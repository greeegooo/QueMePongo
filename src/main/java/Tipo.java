public enum Tipo {

    ZAPATOS(Categoria.CALZADO),
    CAMISA(Categoria.SUPERIOR),
    PANTALON(Categoria.INFERIOR),
    ANTEOJOS(Categoria.ACCESORIO);

    private Categoria categoria;

    Tipo(Categoria categoria){
        this.categoria = categoria;
    }
}
