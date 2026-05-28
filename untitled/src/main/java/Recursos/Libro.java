package Recursos;

public class Libro extends Recursos{
    private String autor;
    private String ISBN;

    public Libro(int id, String titulo, int añoPublicacion, boolean disponible, String autor, String ISBN) {
        super(id, titulo, añoPublicacion, disponible);
        this.autor = autor;
        this.ISBN = ISBN;
    }


}
