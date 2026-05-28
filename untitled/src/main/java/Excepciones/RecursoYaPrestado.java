package Excepciones;

public class RecursoYaPrestado extends RuntimeException {
    public RecursoYaPrestado(String message) {
        super(message);
    }
}
