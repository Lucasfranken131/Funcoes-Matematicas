import java.lang.Math;
import java.lang.reflect.Array;

class SquareFunction{
    public static void main(String args[]){
        System.out.println("Valor de A: "+valorA());
        System.out.println("Valor de B: "+valorB());
        System.out.println("Valor de A: "+valorC());
        System.out.println("Valor de Delta: "+valorDelta());
        System.out.println("Valor de XI: "+valorZero1());
        System.out.println("Valor de XII: "+valorZero2());
        System.out.println("Valor de F: "+valorF());
        System.out.println("Valor da vértice X: "+verticeX());
        System.out.println("Valor da vértice Y: "+verticeY());
    }

    public static double valorA(){
        double a = 1;
        return a;
    }
    public static double valorB(){
        double b = -6;
        return b;
    }
    public static double valorC(){
        double c = 8;
        return c;
    }
    
    public static double valorDelta(){
        double a = valorA();
        double b = valorB();
        double c = valorC();
        double delta = Math.pow(b,2) - 4 * a * c;
        return delta;
    }

    public static double valorZero1(){
        double a = valorA();
        double b = valorB();
        double xi = (-b + Math.sqrt(valorDelta())) / (2*a);
        return xi;
    }

    public static double valorZero2(){
        double a = valorA();
        double b = valorB();
        double xii = (-b - Math.sqrt(valorDelta())) / (2*a);
        return xii;
    }

    public static double valorF(){
        double a = valorA();
        double b = valorB();
        double c = valorC();
        double x = 0;
        double f = + correcaoF(a) * Math.pow(x,2) + correcaoF(b) * x + correcaoF(c);
        return f;
    }

    public static double correcaoF(double abc){
        if(abc == 0){
            return 1;
        }
        else{
            return abc;
        }
    }

    public static double verticeX(){
        double a = valorA();
        double b = valorB();
        double xv = -b / (2*a);
        return xv;
    }

    public static double verticeY(){
        double a = valorA();
        double yv = -valorDelta() / (4*a);
        return yv;
    }
}
