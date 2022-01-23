package Ejercicio3;
import java.lang.Math;

public class LongArea {
    
    public double Area(double radio){
        return pi()*Math.pow(radio,2);
    }
    
    public double Long (double radio){
        return 2*pi()*radio;
    }
    
    static double pi (){
        double pi=3.14159265359;
        return pi;
    }
    
    public boolean esPositivo (double num){
        return num > 0;
    }
}
