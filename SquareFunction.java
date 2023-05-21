import java.lang.Math;
import java.lang.reflect.Array;

class SquareFunction{
    double a;
    double b;
    double c;

    public SquareFunction(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getValorA(){
        return this.a;
    }
    public void setValorA(double a){
        this.a = a;
    }
    public double getValorB(){
        return this.b;
    }
    public void setValorB(double b){
        this.b = b;
    }
    public double getValorC(){
        return this.c;
    }
    public void setValorC(double c){
        this.c = c;
    }

    public double valorDelta(){
        double delta = Math.pow(this.b,2) - 4 * this.a * this.c;
        return delta;
    }

    public double valorZero1(){
        double xi = (-this.b + Math.sqrt(valorDelta())) / (2*this.a);
        return xi;
    }

    public double valorZero2(){
        double xii = (-b - Math.sqrt(valorDelta())) / (2*a);
        return xii;
    }

    public double valorF(){
        double x = 0;
        double f = + correcaoF(this.a) * Math.pow(x,2) + correcaoF(this.b) * x + correcaoF(this.c);
        return f;
    }

    public double correcaoF(double abc){
        if(abc == 0){
            return 1;
        }
        else{
            return abc;
        }
    }

    public double verticeX(){
        double xv = -b / (2*this.a);
        return xv;
    }

    public double verticeY(){
        double yv = -valorDelta() / (4*this.a);
        return yv;
    }
}
