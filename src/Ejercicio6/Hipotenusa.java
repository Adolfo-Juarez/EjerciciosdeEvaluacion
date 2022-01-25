package Ejercicio6;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Hipotenusa {
    /**
     * Calcula el lado más largo de un triángulo rectángulo y proyecta un cuadro de diálogo con el resultado
     * @param ca Cateto opuesto
     * @param co Cateto adyacente
     */
    public void Hipo (double ca, double co){
        DecimalFormat df = new DecimalFormat ("#,###.##");
        JOptionPane.showMessageDialog(null, "El valor de la hipotenusa es:  "+df.format(Math.sqrt(Math.pow(ca, 2)+Math.pow(co, 2))), "Resultado",JOptionPane.INFORMATION_MESSAGE);
    }
    /**
     * Solicita que ingrese un valor para un cateto opuesto
     * @return Valor ingresado por cuadro de diálogo en int
     */
    public double CatetoA(){
        String CatetoAdyacente=JOptionPane.showInputDialog(null, "Ingrese el valor del cateto Adyacente", "Ingrese Datos",JOptionPane.PLAIN_MESSAGE);
        return Double.parseDouble(CatetoAdyacente);
    }
    /**
     * Solicita que ingrese un valor para un cateto adyacente
     * @return Valor ingresado por cuadro de diálogo en int
     */
    public double CatetoO(){
        String CatetoOpuesto=JOptionPane.showInputDialog(null, "Ingresa el valor del cateto opuesto", "Ingrese Datos",JOptionPane.PLAIN_MESSAGE);
        return Double.parseDouble(CatetoOpuesto);
    }
    
}
