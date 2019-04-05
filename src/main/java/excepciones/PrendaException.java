package excepciones;

public class PrendaException extends RuntimeException {
    public PrendaException(String mensaje){
        super(mensaje);
    }
}