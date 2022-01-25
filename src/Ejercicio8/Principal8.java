package Ejercicio8;
import javax.swing.JOptionPane;

public class Principal8 {
    public static void main (String [] Args){
        System.out.println("De a Tres");
        boolean isOk=false;
        int salir=0;
        
        do{
            String num = JOptionPane.showInputDialog(null, "Ingrese la cifra", "Ingrese datos", JOptionPane.PLAIN_MESSAGE);
            if(num.length()!=3){ // Se comprueba que tenga un largo de 3 dígitos
                JOptionPane.showMessageDialog(null, "Ingrese un valor de 3 cifras e inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
            isOk=true; //Se cambia la variable que nos comprueba que se cumple
                for (int i=1; i<=3; i++){//Se abre un bucle for que repetirá tres veces
                    JOptionPane.showMessageDialog(null, i+"° elemento: "+num.charAt(i-1),"Elemento",JOptionPane.INFORMATION_MESSAGE);//Se imprime el valor del carácter correspondiente de la vuelta
                }
                salir = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otra cifra?","Confirmación",JOptionPane.YES_NO_OPTION);
            }
        }while (isOk==false || salir !=1);
        
    }
}
