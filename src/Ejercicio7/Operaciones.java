package Ejercicio7;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Operaciones {
    /**
     * Pide el número de un lado a través de un cuadro de diálogo
     * @return la medida del lado en int
     */
    public double sideA (){
        String NumStr = JOptionPane.showInputDialog(null,"Ingrese la medida del primer lado","Lados",JOptionPane.PLAIN_MESSAGE);
        return Double.parseDouble(NumStr);
    }
    /**
     * Pide el número de un lado a través de un cuadro de diálogo
     * @return la medida del lado en int
     */
    public double sideB(){
        String NumStr = JOptionPane.showInputDialog(null,"Ingrese la medida del segundo lado","Lados",JOptionPane.PLAIN_MESSAGE);
        return Double.parseDouble(NumStr);
    }
    /**
     * Pide el número de un lado a través de un cuadro de diálogo
     * @return la medida del lado en int
     */
    public double sideC(){
        String NumStr = JOptionPane.showInputDialog(null,"Ingrese la medida del tercer lado","Lados",JOptionPane.PLAIN_MESSAGE);
        return Double.parseDouble(NumStr);
    }
    /**
     * Calcula el área de un triágulo con la medida de sus tres lados
     * @param a Primer lado
     * @param b Segundo lado
     * @param c Tercer lado
     */
    public void area (double a, double b, double c){
        DecimalFormat df = new DecimalFormat("#,###.00");
        double p = (a+b+c)/2;
        JOptionPane.showMessageDialog(null,"El Área del Triángulo es: "+df.format(Math.sqrt((p*(p-a)*(p-b)*(p-c)))),"Resultado",JOptionPane.INFORMATION_MESSAGE);
    }
}
