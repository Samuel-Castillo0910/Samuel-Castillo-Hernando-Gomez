package Gestores;

import Excepciones.RecursoNoEsta;
import Recursos.Recursos;

import java.util.List;
import java.util.stream.Collectors;

public class GestorBusqueda {

    private GestorRecursos gestorRecursos;


    /* trate de hacer esto pero no me dio, aqui esta lo que hice comentado para que no de problema

    public List<Recursos> buscarPorTitulo(String Titulo) {


        return Recursos.getRecursosDisponibles.stream()
                .filter(c -> (c.getTitulo() != null) && c.getTitulo().equalsIgnoreCase(Titulo))
                .collect(Collectors.toList());
    }

    public Recursos buscarPorId(int id) throws RecursoNoEsta {
        return Recursos.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RecursoNoEsta("Contenido con id " + id + " no encontrado"));
}
*/
}

