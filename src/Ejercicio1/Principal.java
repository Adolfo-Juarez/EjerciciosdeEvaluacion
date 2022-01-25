package Ejercicio1;
import java.util.Scanner; //Se importa la clase Scanner para entrada de datos

public class Principal {
    public static void main (String[] Args){
        
        System.out.println("\t\t¿ES PRIMO?");
        
        Scanner sc = new Scanner(System.in);
        Primo es = new Primo(); //Instanciamos el método primo de la clase Primo en el objeto es
        int Num=1; //Creamos la variable e inicializamos para que pueda entrar en el while
        while(Num!=0){ //Siempre que el número ingresado sea diferente de 0 (la opción para salir) se repetirá
            System.out.print("Ingrese un número: ");
            Num = sc.nextInt(); //el método NextInt transforma el return del Scanner de String a Int
            if(Num!=0){ //Evita que este mensaje salga cuando se presiona 0 para salir
                System.out.println(Num+es.Primo(Num));
                System.out.println("Agruegue el siguiente número o escriba 0 para salir\n");
            }
        }
    }
}