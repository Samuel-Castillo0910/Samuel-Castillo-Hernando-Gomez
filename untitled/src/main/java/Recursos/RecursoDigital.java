package Recursos;

public class RecursoDigital extends Recursos {
    private String URL;

    public RecursoDigital(int id, String titulo, int añoPublicacion, boolean disponible, String URL) {
        super(id, titulo, añoPublicacion, true);
        this.URL=URL;
    }
}
