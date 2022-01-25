package Ejercicio7;
import javax.swing.JOptionPane;

public class Principal7 {
    public static void main (String[] Args){
        Operaciones op = new Operaciones ();
        System.out.println("Calcula Triángulos");
        int salir;
        
        do{
            double lado1=op.sideA();
            double lado2=op.sideB();
            double lado3=op.sideC();
            op.area(lado1,lado2,lado3);//Obtiene el área de un triángulo con la medida de sus lados
            salir = JOptionPane.showConfirmDialog(null, "¿Desea realizar otro cálculo?","Confirmación",JOptionPane.YES_NO_OPTION);
        }while(salir!=1);
    }
}
