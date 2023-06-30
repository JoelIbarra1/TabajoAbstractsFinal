import java.util.ArrayList;
import java.util.List;

public abstract class Figura {
    String tipo;
    double dato;
    double dato2;

    public Figura(String tipo, double dato, double dato2) {
        this.tipo = tipo;
        this.dato = dato;
        this.dato2 = dato2;
    }

    protected Figura() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getDato() {
        return dato;
    }

    public void setDato(double dato) {
        this.dato = dato;
    }

    public double getDato2() {
        return dato2;
    }

    public void setDato2(double dato2) {
        this.dato2 = dato2;
    }

    public List<Punto> getListadePuntos() {
        return ListadePuntos;
    }

    public void setListadePuntos(List<Punto> listadePuntos) {
        ListadePuntos = listadePuntos;
    }

    List<Punto> ListadePuntos = new ArrayList<>();

    public abstract double CalcularPerimetro();
    public abstract double CalcularArea();
    public abstract double CalcularVolumen();



}