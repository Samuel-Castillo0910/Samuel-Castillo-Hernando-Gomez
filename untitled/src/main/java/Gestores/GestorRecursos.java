package Gestores;

import Excepciones.RecursoAntiguo;
import Excepciones.RecursoNoEsta;
import Recursos.Recursos;

import java.util.ArrayList;
import java.util.HashMap;

public class GestorRecursos {

    private Recursos recurso;
    private ArrayList<Recursos> recursosDisponibles = new ArrayList<>();
    private ArrayList<Recursos> recursosPrestados = new ArrayList<>();



    public void agregarRecurso(Recursos recurso)throws RecursoAntiguo {
        if(recurso.getAñoPublicacion() < 1923){
            throw new RecursoAntiguo("El recurso es muy antiguo para ser prestado");
        } else {
            recursosDisponibles.add(recurso);
            recurso.setDisponible(true);
        }
    }

    public void prestarRecurso(Recursos recurso){
        recursosPrestados.add(recurso);
        recursosDisponibles.remove(recurso);
        recurso.setDisponible(false);
    }

    public void devolverRecruso(Recursos recurso){
        recursosDisponibles.add(recurso);
        recurso.setDisponible(true);
    }

    public ArrayList<Recursos> getRecursosDisponibles() {
        return recursosDisponibles;
    }

    public void ReportarUso(){
        System.out.println("Hay disponibles "+recursosDisponibles.size()+" recursos para pedir prestados");
        System.out.println("En este momento hay "+recursosPrestados.size()+" recursos prestados");

    }


    public String mostrarDisponible() {
        return "GestorRecursos{" +
                "recursos Disponibles=" + recursosDisponibles +
                '}';
    }

    public String mostrarPrestados() {
        return "GestorRecursos{" +
                "recursos prestados=" + recursosPrestados +
                '}';
    }
}
