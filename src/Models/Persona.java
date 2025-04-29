//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Models;

public class Persona {
    private String name;
    private int edad;
    private Direccion direccion;

    public Persona(String name, int edad, Direccion direccion) {
        this.name = name;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return this.direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getCodigoDireccion(Persona persona) {
        return this.direccion.getCodigo();
    }

    public boolean compareCodigoDireccion(Persona persona) {
        boolean condicion = this.direccion.getCodigo() > persona.getDireccion().getCodigo();
        return condicion;
    }

    public boolean compareCodigoDireccion(int codigoDireccion) {
        boolean condicion = this.direccion.getCodigo() > codigoDireccion;
        return condicion;
    }

    public boolean equalsByCodigoDireccion(Persona persona) {
        boolean condicion = this.direccion.getCodigo() == persona.getDireccion().getCodigo();
        return condicion;
    }

    public boolean equalsByCodigoDireccion(int codigoDireccion) {
        boolean condicion = this.direccion.getCodigo() == codigoDireccion;
        return condicion;
    }

    public String toString() {
        String var10000 = this.name;
        return "Nombre: " + var10000 + ", Edad: " + this.edad + ", Direccion: " + String.valueOf(this.direccion);
    }
}
