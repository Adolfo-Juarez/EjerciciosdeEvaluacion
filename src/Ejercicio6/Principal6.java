package Ejercicio6;
import javax.swing.JOptionPane; //Se importa librería para imprimir cuadros de dialogo

public class Principal6 {
    public static void main (String[] Args){
        Hipotenusa hp = new Hipotenusa();
        System.out.println("Descubre Hipotenusa");
        int salir;
        
        do{
            double co = hp.CatetoO(); //Método para pedir el valor del cateto opuesto
            double ca=hp.CatetoA();
            hp.Hipo(ca, co); 
            salir = JOptionPane.showConfirmDialog(null, "¿Desea realizar otro cálculo?","Confirmación",JOptionPane.YES_NO_OPTION);//Cuadro de diálogo para salir o continuar el programa
        }while(salir!=1);
    }
}
