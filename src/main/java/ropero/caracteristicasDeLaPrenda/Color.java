package ropero.caracteristicasDeLaPrenda;

import java.util.Objects;

public class Color {

    public int red;
    public int green;
    public int blue;

    public Color(int red, int green, int blue){
        this.red = red;
        this.blue = blue;
        this.green = green;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Color)) return false;
        Color color = (Color) o;
        return red == color.red &&
                green == color.green &&
                blue == color.blue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(red, green, blue);
    }
}
