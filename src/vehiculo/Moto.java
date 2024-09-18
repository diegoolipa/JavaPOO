
package vehiculo;

public class Moto extends Vehiculo{
    
    
    public Moto(String caballoFuerza,int ruedas, String modelo, String color, String marca, int capacidad, int añoFabricas){
        super(caballoFuerza,ruedas,modelo,color,marca,capacidad,añoFabricas);
    }
    
    public void frenar(){
        System.out.println("La Moto frena");
    }
    
    
}
