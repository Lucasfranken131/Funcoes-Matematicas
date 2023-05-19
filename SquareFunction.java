import java.lang.Math;
import java.lang.reflect.Array;

class SquareFunction{
    public static void main(String args[]){
        double a = valorA();
        double b = valorB();
        double c = valorC();
        double delta = Math.pow(b,2) - 4 * a * c;
        double bMais = -b + Math.sqrt(delta);
        double bMenos = -b - Math.sqrt(delta);
        double xi = bMais / (2*a);
        double xii = bMenos / (2*a);
        System.out.println("XI = "+xi);
        System.out.println("XII = "+xii);
    }

    public static double valorA(){
        double a = 1;
        return a;
    }
    public static double valorB(){
        double b = -1;
        return b;
    }
    public static double valorC(){
        double c = -12;
        return c;
    }

    public static double valorF(){
        double a = valorA();
        double b = valorB();
        double c = valorC();
        double x = 2;
        double valorF = +-a * Math.pow(x,2) +- b*x +- c;
        return f;
    }
}
