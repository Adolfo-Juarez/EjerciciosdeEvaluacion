package Ejercicio10;
import javax.swing.JOptionPane;

public class Principal10 {
    public static void main (String[] Args){
        System.out.println("Verificador de hora");
        
        Tiempo tm = new Tiempo ();
        int h,m,s;
        
        do{
            do{
                h = tm.Hora();
                if (h > 23 || h < 0){
                    tm.Error();
                }
            }while(h>23 || h <0);

            do{
                m = tm.Minuto();
                if (m > 59||m < 0){
                    tm.Error();
                }
            }while(m>59 || m <0);

            do{
                s = tm.Segundo();
                if (s > 59||s < 0){
                    tm.Error();
                }
            }while(s>59 || s <0);
            
            tm.Reloj(h, m, s);
            
        }while(JOptionPane.showConfirmDialog(null, "¿Desea ingresar otra hora?","Continuar",JOptionPane.YES_NO_OPTION)!=1);
    }
}
