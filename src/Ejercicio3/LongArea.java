package Ejercicio3;

public class LongArea {
    /**
     * Este método calcula el área de un círculo 
     * únicamente ingresando su radio
     * @return 
     * double area_de_circulo
    */
    public double Area(double radio){
        return pi()*Math.pow(radio,2); //PI*r²
    }
    /**
     * Obtiene la longitud de la circunferencia a través de su radio
     * @return 
     * double longitud
    */
    public double Long (double radio){
        return 2*pi()*radio;
    }
    /**
     * @return 
     * Valor de pi con 11 decimales
    */
    static double pi (){
        double pi=3.14159265359;
        return pi;
    }
    /**
     * Método que verifica si un valor es postivo o no
     * @return 
     * TRUE si es postivo ó FALSE si es negativo
    */
    public boolean esPositivo (double num){
        return num > 0;
    }
}
