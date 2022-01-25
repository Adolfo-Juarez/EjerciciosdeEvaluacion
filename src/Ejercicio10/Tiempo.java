package Ejercicio10;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.Icon;

public class Tiempo {
    /**
     * Muestra mensaje de error
     */
    public void Error (){
        Icon x = new ImageIcon(getClass().getResource("/Ejercicio10/error.png"));
        JOptionPane.showMessageDialog(null, "Dato incorrecto. Inténte de nuevo","Dato inválido",JOptionPane.ERROR_MESSAGE,x);
    }
    /**
     * Convierte entrada de una hora
     * @return int hora
     */
    public int Hora (){
        String H=JOptionPane.showInputDialog(null, "Ingrese la hora (0-23)","Horas", JOptionPane.INFORMATION_MESSAGE);
        int hour=Integer.parseInt(H);
        return hour;
    }
    /**
     * Convierte entrada de una minuto
     * @return int minuto
     */
    public int Minuto (){
        String M=JOptionPane.showInputDialog(null, "Ingrese los minutos (0-59)","Minutos", JOptionPane.INFORMATION_MESSAGE);
        int minute=Integer.parseInt(M);
        return minute;
    }
    /**
     * Convierte entrada de una segundo
     * @return int segundo
     */
    public int Segundo (){
        String S = JOptionPane.showInputDialog(null,"Ingrese los segundos (0-59)","Segundos",JOptionPane.INFORMATION_MESSAGE);
        int segundo = Integer.parseInt(S);
        return segundo;
    }
    /**
     * Muestra la hora, minuto y segundo en orden HH:MM:SS
     * @param h hora
     * @param m minuto
     * @param s segundo
     */
    public void Reloj (int h, int m, int s){
        Icon icon = new ImageIcon(getClass().getResource("/Ejercicio10/Finish.png"));
        JOptionPane.showMessageDialog(null,"Su hora "+h+":"+m+":"+s+"  ha sido verificada","Resultado",JOptionPane.OK_OPTION,icon);
    }
}
