//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Models;

public class Direccion {
    private String calle;
    private int numeroCalle;
    private int codigo;

    public Direccion(String calle, int numeroCalle, int codigo) {
        this.calle = calle;
        this.numeroCalle = numeroCalle;
        this.codigo = codigo;
    }

    public String getCalle() {
        return this.calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroCalle() {
        return this.numeroCalle;
    }

    public void setNumeroCalle(int numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String toString() {
        return this.calle + " #" + this.numeroCalle + ", Código: " + this.codigo;
    }
}
