//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import controllers.PersonaController;
import Models.Direccion;
import Models.Persona;
import Views.ViewConsole;

public class App {
    public App() {
    }

    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[5];
        personas[0] = new Persona("Maria", 30, new Direccion("Calle 2", 23, 56));
        personas[1] = new Persona("Pedro", 35, new Direccion("Calle 3", 34, 67));
        personas[2] = new Persona("Ana", 28, new Direccion("Calle 4", 45, 78));
        personas[3] = new Persona("Juan", 25, new Direccion("Calle 1", 12, 45));
        personas[4] = new Persona("Luis", 40, new Direccion("Calle 5", 56, 89));
        PersonaController pC = new PersonaController();
        ViewConsole vC = new ViewConsole();
        vC.printArray(personas);
        System.out.println("Arreglado por Codigo (Descendente)");
        pC.sortByDireccionCodigo(personas);
        vC.printArray(personas);
        System.out.println("Buscando persona con calle codigo 56");
        Persona pB = pC.findByCodigoDireccion(personas, 56);
        if (pB == null) {
            System.out.println("No existe");
        } else {
            System.out.println("La persona es " + String.valueOf(pB));
        }

    }
}
