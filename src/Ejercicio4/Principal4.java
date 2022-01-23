package Ejercicio4;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal4 {
    public static void main (String [] Args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat ("#,###.##");
        Conversor cv = new Conversor ();
        double km=1;
        System.out.print("\t\tDE KILOMETROS A METROS\nIngrese la velocidad que desea convertir: ");
        while(km!=0){
            km = sc.nextDouble();
            if(km!=0){
                System.out.println(km+" km/h = "+df.format(cv.ms(km))+" m/s\n\nIngrese otra cantidad o presione 0 para salir");
            }
        }
    }
}
