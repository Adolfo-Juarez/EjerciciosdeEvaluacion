package Ejercicio1;

public class Primo {
    String Primo (int Num){
        if (Num>0){
            for (int x = 2; x< Num; x++){
                if (Num%x==0){
                    return " no es primo";
                }
            }
        }
        else{
         return " no es un número entero positivo";   
        }
        return "  es primo";
    }
}
