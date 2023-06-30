import java.util.Scanner;

public abstract class Piramide extends Triangulo {
    double ladop;
    double altura;
    double alturat;

    public void IngresaPuntos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la componente x del punto ");
        double x = sc.nextDouble();
        System.out.println("ingrese la componente y del punto ");
        double y = sc.nextDouble();
        System.out.println("ingrese la componente z del punto ");
        double z = sc.nextDouble();
        System.out.println("ingrese la distancia de los lados");
        double dis = sc.nextDouble();
        this.ladop = dis;
        System.out.println("ingrese la altura del triangulo de las caras ");
        double alturac = sc.nextDouble();
        this.alturat = alturac;
        System.out.println("ingrese la altura de la piramide ");
        double alturap = sc.nextDouble();
        this.altura = alturap;
    }

    public Piramide (){
    }
    @Override
    public double CalcularArea(){
        return Math.pow(ladop,2)+(2*ladop*alturat);
    }
    @Override
    public double CalcularVolumen(){
        return (1/3)*(Math.pow(ladop,2));
    }

}