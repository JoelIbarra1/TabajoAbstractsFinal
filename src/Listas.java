public class Listas {
    public String tipo;
    public double perimetro;
    public double area;
    public double volumen;


    public Listas(String tipo, double perimetro, double area, double volumen) {
        this.tipo = tipo;
        this.perimetro = perimetro;
        this.area = area;
        this.volumen = volumen;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

}