
package vehiculo;

public class Auto extends Vehiculo{
    private int numeroPuesta;
    
    public Auto(String caballoFuerza, int ruedas, String modelo, String color, String marca, int capacidad, int añoFabricas, int numeroPuesta) {
        super(caballoFuerza, ruedas, modelo, color, marca, capacidad, añoFabricas);
        this.numeroPuesta = numeroPuesta;
    }
    
    
    @Override
    public void informacion(){
        super.informacion();
        System.out.println("numero de puertas: " + numeroPuesta);
    }
}
