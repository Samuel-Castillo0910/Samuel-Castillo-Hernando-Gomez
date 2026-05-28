package Main;

import Recursos.Libro;
import Recursos.Revista;
import Recursos.RecursoDigital;
import Recursos.Recursos;

public class Main {
    static void main(String[] args) {
        Recursos libro1 = new Libro(0,"Raton",2019,
                true,"Samuel Castillo","123456a");
        Recursos libro2 = new Libro(1,"Leon",1950,
                true,"Samuel Castillo","1234567b");

        Recursos revista1 = new Revista(2,"Como Prender la Luz", 1980,
        true,1,"Panamericana");
        Recursos revista2 = new Revista(3,"Como caminar", 1940,
                true,2,"Saber");

        Recursos recursoDigital1 = new RecursoDigital(4,"Tesis1",2000,
                true, "www.pepe.com");
        Recursos recursoDigital2 = new RecursoDigital(5,"Tesis2",2001,
                true, "www.mama.com");

        Recursos libro3 = new Libro(6,"Sa´po",1900,
                true,"Samuel Castillo","12345678c");


    }
}
