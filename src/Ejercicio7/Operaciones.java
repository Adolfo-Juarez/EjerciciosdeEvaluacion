package Ejercicio7;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Operaciones {
    public double sideA (){
        String NumStr = JOptionPane.showInputDialog(null,"Ingrese la medida del primer lado","Lados",JOptionPane.PLAIN_MESSAGE);
        return Double.parseDouble(NumStr);
    }
    public double sideB(){
        String NumStr = JOptionPane.showInputDialog(null,"Ingrese la medida del segundo lado","Lados",JOptionPane.PLAIN_MESSAGE);
        return Double.parseDouble(NumStr);
    }
    public double sideC(){
        String NumStr = JOptionPane.showInputDialog(null,"Ingrese la medida del tercer lado","Lados",JOptionPane.PLAIN_MESSAGE);
        return Double.parseDouble(NumStr);
    }
    public void area (double a, double b, double c){
        DecimalFormat df = new DecimalFormat("#,###.00");
        double p = (a+b+c)/2;
        JOptionPane.showMessageDialog(null,"El Área del Triángulo es: "+df.format(Math.sqrt((p*(p-a)*(p-b)*(p-c)))),"Resultado",JOptionPane.INFORMATION_MESSAGE);
    }
}
