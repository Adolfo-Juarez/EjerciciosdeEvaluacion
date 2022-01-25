package Ejercicio1;

public class Primo {
/**
 * Este método identifica si el número ingresado como parámetro, es positivo o no
 * y regresa un valor string que indica si es positivo, o no.
 * @return
 * " es primo", " no es primo", " no es un número entero positivo"
*/
    String Primo (int Num){ 
        if (Num>0){ 
            for (int x = 2; x< Num; x++){ 
                if (Num%x==0){
                    return " no es primo";
                /*
                    Se inicia x con el valor de 2, y el bucle for se repetirá hasta
                    que x sea menor que el número ingresado (Num-1), de este modo 
                    divideremos al número ingresado entre todos los números enteros
                    positivos de 2-Num para saber si es primo o no.
                */
                }
            }
        }
        else{ //Si el número es negativo, no se puede evaluar y regresa que no es un número entero positivo
         return " no es un número entero positivo";   
        }
        return "  es primo";//Si ninguno de los casos anteriores se cumple, significa que es primo
    }
}
