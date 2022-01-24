package Ejercicio9;

import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Principal9 {
    public static void main (String [] Args){
        ImageIcon icon = new ImageIcon("Ejercicio9/img/2.png");
        Principal9 r = new Principal9 ();
        System.out.println("Número de la suerte");
        int salir =0;
        do{
        String a = JOptionPane.showInputDialog(null, "Ingrese su fecha de nacimiento", "Número de la fortuna", JOptionPane.QUESTION_MESSAGE);
        int dia = Integer.parseInt(a);
        String b = JOptionPane.showInputDialog(null, "Ingrese su mes de nacimiento", "Número de la fortuna", JOptionPane.QUESTION_MESSAGE);
        int mes = Integer.parseInt(b);
        String c = JOptionPane.showInputDialog(null, "Ingrese su año de nacimiento", "Número de la fortuna", JOptionPane.QUESTION_MESSAGE);
        int anio = Integer.parseInt(c);
        if (isOk("Dia",a)==true && isOk("Mes",b)==true && isOk("Anio",c)==true){
            r.MyLucky(dia,mes,anio);
            salir = JOptionPane.showConfirmDialog(null, "¿Desea conseguir otro número de la suerte?","Confirmación",JOptionPane.YES_NO_OPTION);
        }
        else{
            JOptionPane.showMessageDialog(null, "Ingrese un valor verifique sus datos e inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
        }
       }while(salir !=1);
    }
    
    public static boolean isOk(String tipo, String x){
        int value = Integer.parseInt(x);
        boolean rtrn=false;
        switch (tipo){
            case "Dia": rtrn = value >=1 && value <=31;
                break;
            case "Mes": rtrn = value >=1 && value <=12;
                break;
            case "Anio": rtrn = value >=1900 && value <=2021;
                break;
        }
        return rtrn;
    }
    
    public void MyLucky (int a, int b, int c){
        Icon w = new ImageIcon(getClass().getResource("/Ejercicio9/2.png"));
        int lucky = a+b+c;
        String Aux = Integer.toString(lucky);
        
        lucky = 0;
        
        for (int i=0; i<=3; i++){
            char t = Aux.charAt(i);
            lucky = lucky + Integer.parseInt(String.valueOf(t));
        }
        
        JOptionPane.showMessageDialog(null, "Tu número de la suerte es :"+lucky,"¡Felicidades!",JOptionPane.OK_OPTION,w);
        
    }
}
