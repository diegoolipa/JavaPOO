
package vehiculo;
//Autor: Diego Lipa
public class Principal {
    public static void main(String[] args) {
        //instanciar = invicar = llamar a un objeto
        Moto moto = new Moto("1700",2,"Honda","Gris","hdp",4,2075);
        //moto.encender();
        //moto.transportar();
        //moto.frenar();
        moto.informacion();
        
        Moto moto1 = new Moto("7000",2,"Pulsar","Negro","Pulsar",4,2025);
        //moto1.encender();
        //moto1.transportar();
        //moto1.frenar();
        moto1.informacion();
        
        
        
       //instanciar = invicar = llamar a un objeto
       Auto autito = new Auto("500",4,"Totoya","Negro","Totoya",10,2025,6);
       autito.informacion();
    } 
}
