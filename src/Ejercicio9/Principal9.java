package Ejercicio9;

import javax.swing.JOptionPane;
import javax.swing.Icon;//Librerías para cambiar la imagen de los cuadros de diálogos
import javax.swing.ImageIcon;

public class Principal9 {
    public static void main (String [] Args){
        ImageIcon icon = new ImageIcon("Ejercicio9/img/2.png");
        Principal9 r = new Principal9 (); //Se crea un objeto llamando a un método de esta misma clase
        System.out.println("Número de la suerte");
        int salir =0;
        do{
        String a = JOptionPane.showInputDialog(null, "Ingrese su fecha de nacimiento", "Número de la fortuna", JOptionPane.QUESTION_MESSAGE);
        int dia = Integer.parseInt(a);
        String b = JOptionPane.showInputDialog(null, "Ingrese su mes de nacimiento", "Número de la fortuna", JOptionPane.QUESTION_MESSAGE);
        int mes = Integer.parseInt(b);
        String c = JOptionPane.showInputDialog(null, "Ingrese su año de nacimiento", "Número de la fortuna", JOptionPane.QUESTION_MESSAGE);
        int anio = Integer.parseInt(c);
        if (isOk("Dia",a)==true && isOk("Mes",b)==true && isOk("Anio",c)==true){//Se comprueba que los datos sean correctos
            r.MyLucky(dia,mes,anio); //Imprime el número de fortuna
            salir = JOptionPane.showConfirmDialog(null, "¿Desea conseguir otro número de la suerte?","Confirmación",JOptionPane.YES_NO_OPTION);
        }
        else{//Si no son valores permitidos, muestra mensaje de error
            JOptionPane.showMessageDialog(null, "Ingrese un valor verifique sus datos e inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
       }while(salir !=1); //Al presionar NO en el cuadro de diálogo, regresa un valor 1
    }
    
    public static boolean isOk(String tipo, String x){
        int value = Integer.parseInt(x);
        boolean rtrn=false;
        switch (tipo){
            case "Dia": rtrn = value >=1 && value <=31; //Verifica que el dia tenga un rango coherente y regresa el valor de la comparación
                break;
            case "Mes": rtrn = value >=1 && value <=12;
                break;
            case "Anio": rtrn = value >=1900 && value <=2021;
                break;
        }
        return rtrn;
    }
    
    public void MyLucky (int a, int b, int c){
        Icon w = new ImageIcon(getClass().getResource("/Ejercicio9/2.png"));//Se coloca el núevo ícono del cuadro de diálogo
        int lucky = a+b+c; //Se suman los días, mes, y año
        String Aux = Integer.toString(lucky); // Se convierte a String
        
        lucky = 0; // Se restablece la variable del número de la suerte
        
        for (int i=0; i<=3; i++){ //La suma decualquier posible día, mes y año darán un número entero de 4 dígitos, por lo cuál, sumaremos estos número individualmente
            lucky = lucky + Integer.parseInt(String.valueOf(Aux.charAt(i)));
            /*
            Esta parte es un poco enredada:
            Aux.chartAt(i) regresa el valor del carácter en la posición i del String Aux
            String.valueOf() convierte este char a String, ya que charAt regresa valores char
            Intenger.parseInt() convierte este String a Int
            Éste último valor es sumado a lucky, quedando la operación de esta forma:
            
            Suponiendo que Aux "1999"
            Operación realizado en el ciclo: 1+9+9+9 = 28
            */
        }
        
        JOptionPane.showMessageDialog(null, "Tu número de la suerte es :"+lucky,"¡Felicidades!",JOptionPane.OK_OPTION,w);
        
    }
}
