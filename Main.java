import javax.swing.JOptionPane;

class Main{
    public static void main(String args[]){
        String a_string = JOptionPane.showInputDialog("Insira o valor de A:");
        double a = Double.parseDouble(a_string);
        String b_string = JOptionPane.showInputDialog("Insira o valor de B:");
        double b = Double.parseDouble(b_string);
        String c_string = JOptionPane.showInputDialog("Insira o valor de C:");
        double c = Double.parseDouble(c_string);
        SquareFunction function1 = new SquareFunction(a,b,c); 

        System.out.println("Valor de A: "+function1.getValorA());
        System.out.println("Valor de B: "+function1.getValorB());
        System.out.println("Valor de A: "+function1.getValorC());
        System.out.println("Valor de Delta: "+function1.valorDelta());
        double delta = function1.valorDelta();
        if(delta >= 0){
            System.out.println("Valor de XI: "+function1.valorZero1());
            System.out.println("Valor de XII: "+function1.valorZero2());
        }
        System.out.println("Valor de F: "+function1.valorF());
        System.out.println("Valor da vértice X: "+function1.verticeX());
        System.out.println("Valor da vértice Y: "+function1.verticeY());
    }
}