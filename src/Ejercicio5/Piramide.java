package Ejercicio5;

public class Piramide {
    /**
     * Este método verifica que un número de tipo entero tenga cierta cantidad de dígito
     * @param a El valor del número a verificar
     * @return Si el valor del largo coincide, regresa true, sino false
     */
    public boolean largo(int a){
        String largo = Integer.toString(a);
        return largo.length()==5; // = if largo=5; else
    }
    /**
     * Contruye una piramide de letras.
     * 
     * Se requiere que se compruebe que el largo en cifras de este número sea 5
     * 
     * @param a Número de 5 dígitos de largo ej. 12345, 52952, etc.
     * @return un pirámide escalonada de 5 pisos
     */
    public String construir (int a){
        String piramide=""; //Se incializa la variabel String para el return
        String numCadena = Integer.toString(a); //Se Convierte a String el parámetro
        for (int x=0; x<=4; x++){ //Se establece x de 0 a 4 para ubicar el carácter de la posición 0 a la 4
            for (int y=0; y<=x;y++){//Se estable otra variable de casi con los mismos datos de x que apilará los datos
                piramide = piramide+numCadena.charAt(x);
                /*
                Cuando x=2
                y a = 12345
                pirámide vale en
                Primer ciclo: 1
                Segundo ciclo: 12
                Tercer ciclo: 123
                */
            }
            piramide=piramide+"\n";//Cada vez que x==y, imprime salto de línea
            /*
            Cuando x=2
            y a = 12345
            Salida sin salto de línea:
            112123
            Salida con salto de línea:
            1
            12
            123
            */
        }
        return piramide;
    }
}
