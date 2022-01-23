package Ejercicio3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal3 {
    public static void main (String [] Args){
        Scanner sc = new Scanner(System.in);
        LongArea la = new LongArea();
        DecimalFormat df = new DecimalFormat("#,###.00");
        
        double radio;
        
        System.out.print("\t\tCIRCUNFERENCIAS\n");
        do{
            System.out.print("Ingrese el radio de la circunferencia para calcular su longitud y área: ");
            radio = sc.nextDouble();
            if (la.esPositivo(radio)==true){
                System.out.println("Aŕea: "+df.format(la.Area(radio))+"\nLongitud: "+df.format(la.Long(radio))+"\nIngrese otro número o presione 0 para salir.");
            }
            else{
                if(radio !=0){
                System.out.println("Ingrese un número positivo e inténtelo de nuevo");
                }
            }
        } while(radio!=0);
    }
}
