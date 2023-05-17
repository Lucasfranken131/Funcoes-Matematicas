import java.lang.Math;

class SquareFunction{
    public static void main(String args[]){
        double a = 1;
        double b = -1;
        double c = -12;
        double b_pow = Math.pow(b,2);
        double delta = b_pow - 4 * a * c;
        double delta2 = Math.sqrt(delta);
        double doisA = 2 * a;
        double bNegativo = b - (b*2);
        double bMais = bNegativo + delta2;
        double bMenos = bNegativo - delta2;
        double xi = bMais / doisA;
        double xii = bMenos / doisA;
        System.out.println(xi);
        System.out.println(xii);
    }
}