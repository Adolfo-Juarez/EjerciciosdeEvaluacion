package Ejercicio2;
import java.util.Scanner;
//¿Hace falta explicar?
public class Principal2 {
    public static void main (String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\t\t¡SALUDOS!\nIngrese su nombre: ");
        String name = sc.next();
        System.out.println("Buenos días "+name+" :)");
    }
}