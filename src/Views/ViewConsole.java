//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Views;

import Models.Persona;

public class ViewConsole {
    public ViewConsole() {
    }

    public void printArray(Persona[] personas) {
        for(int i = 0; i < personas.length; ++i) {
            System.out.println(personas[i]);
        }

    }
}
