package Ejercicio6;
import javax.swing.JOptionPane;

public class Principal6 {
    public static void main (String[] Args){
        Hipotenusa hp = new Hipotenusa();
        System.out.println("Descubre Hipotenusa");
        int salir;
        
        do{
            double co = hp.CatetoO();
            double ca=hp.CatetoA();
            hp.Hipo(ca, co);
            salir = JOptionPane.showConfirmDialog(null, "¿Desea realizar otro cálculo?","Confirmación",JOptionPane.YES_NO_OPTION);
        }while(salir!=1);
    }
}
