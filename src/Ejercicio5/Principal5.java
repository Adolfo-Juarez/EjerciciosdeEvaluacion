package Ejercicio5;
import java.util.Scanner;

public class Principal5 {
    public static void main (String[] Args){
        Scanner sc = new Scanner (System.in);
        Piramide pm = new Piramide ();
        int num;
        
        System.out.print("\t\tPIRÁMIDE DE NÚMEROS\nIngrese un número de 5 cifras: ");
        do{
            num = sc.nextInt();
            if (pm.largo(num)==true){ // Se verifica que el largo del número ingresado sea 5
                System.out.println(pm.construir(num)+"Ingrese otro número de 5 cifras o presione 0 para salir");
            }
            else{
                if(num!=0){
                System.out.println("Ingrese un número de 5 cifras e inténte de nuevo");
                }
            }
        }while(num != 0);
    }
}