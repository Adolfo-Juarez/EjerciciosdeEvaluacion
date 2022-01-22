package Ejercicio1;
import java.util.Scanner;

public class Principal {
    public static void main (String[] Args){
        Scanner sc = new Scanner(System.in);
        Primo es = new Primo();
        int Num=1;
        while(Num!=0){
            System.out.print("Ingrese un número: ");
            Num = sc.nextInt();
            System.out.println(Num+es.Primo(Num));
            System.out.println("Agruegue el siguiente número o escriba 0 para salir\n");
        }
    }
}
