import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o valor de A: ");
        double a = scan.nextDouble();
        System.out.println("Insira o valor de B: ");
        double b = scan.nextDouble();
        System.out.println("Insira o valor de C: ");
        double c = scan.nextDouble();
        System.out.println(" ");
        SquareFunction function1 = new SquareFunction(a,b,c); 

        System.out.println("Valor de A: "+function1.getValorA());
        System.out.println("Valor de B: "+function1.getValorB());
        System.out.println("Valor de A: "+function1.getValorC());
        System.out.println("Valor de Delta: "+function1.valorDelta());
        System.out.println("Valor de XI: "+function1.valorZero1());
        System.out.println("Valor de XII: "+function1.valorZero2());
        System.out.println("Valor de F: "+function1.valorF());
        System.out.println("Valor da vértice X: "+function1.verticeX());
        System.out.println("Valor da vértice Y: "+function1.verticeY());
    }
}