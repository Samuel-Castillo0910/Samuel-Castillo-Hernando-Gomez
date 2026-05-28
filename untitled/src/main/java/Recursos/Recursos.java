package Recursos;

import java.util.Objects;

public abstract class Recursos {
    private int id;
    private String titulo;
    private int añoPublicacion;
    private boolean Disponible;

    public Recursos(int id, String titulo, int añoPublicacion, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
        this.Disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDisponible(boolean disponible) {
        Disponible = disponible;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Recursos recursos = (Recursos) o;
        return añoPublicacion == recursos.añoPublicacion && Objects.equals(titulo, recursos.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, añoPublicacion);
    }

    @Override
    public String toString() {
        return "Recursos{" +
                "titulo='" + titulo + '\'' +
                '}';
    }
}
