package Ejercicio5;

public class Piramide {
    public boolean largo(int a){
        String largo = Integer.toString(a);
        return largo.length()==5;
    }
    
    public String construir (int a){
        String piramide="";
        String numCadena = Integer.toString(a);
        for (int x=0; x<=4; x++){
            for (int y=0; y<=x;y++){
                piramide = piramide+numCadena.charAt(y);
            }
            piramide=piramide+"\n";
        }
        return piramide;
    }
}
