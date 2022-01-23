package Ejercicio6;

import java.lang.Math;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Hipotenusa {
    
    public void Hipo (double ca, double co){
        DecimalFormat df = new DecimalFormat ("#,###.##");
        JOptionPane.showMessageDialog(null, "El valor de la hipotenusa es:  "+df.format(Math.sqrt(Math.pow(ca, 2)+Math.pow(co, 2))), "Resultado",JOptionPane.INFORMATION_MESSAGE);
    }
    public double CatetoA(){
        //Icon icono = new ImageIcon(getClass().getResource("/Ejercicio6/img/ca.png"));
        String CatetoAdyacente=JOptionPane.showInputDialog(null, "Ingrese el valor del cateto Adyacente", "Ingrese Datos",JOptionPane.PLAIN_MESSAGE);
        return Double.parseDouble(CatetoAdyacente);
    }
    
    public double CatetoO(){
        String CatetoOpuesto=JOptionPane.showInputDialog(null, "Ingresa el valor del cateto opuesto", "Ingrese Datos",JOptionPane.PLAIN_MESSAGE);
        return Double.parseDouble(CatetoOpuesto);
    }
    
}
