package Recursos;

public class Revista extends Recursos{
    private int edicion;
    private String editorial;

    public Revista(int id, String titulo, int añoPublicacion, boolean disponible, int edicion, String editorial) {
        super(id, titulo, añoPublicacion, disponible);
        this.edicion=edicion;
        this.editorial=editorial;
    }
}
