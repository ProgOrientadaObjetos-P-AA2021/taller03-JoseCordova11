package paquete2;
import paquete1.Terreno;
/**
 *
 * @author Jose Cordova
 */
public class Ejecutor {
    public static void main(String[] args) {
        Terreno t1 = new Terreno();
        Terreno t2 = new Terreno();
        t1.establecerAncho(654.95);
        t1.establecerLargo(1045.50);
        t1.establecerCostoMetroCuadrado(24);
        t1.establecerArea();
        t1.establecerCosto();
        
        t2.establecerAncho(456.87);
        t2.establecerLargo(788.12);
        t2.establecerCostoMetroCuadrado(14.99);
        t2.establecerArea();
        t2.establecerCosto();
        
        System.out.printf("El terreno 1 tiene un largo de "
                + "%.2fm. y un ancho de %.2fm.\ntiene un area total de $%.2f \n"
                + "dado el precio por metro cuadrado de $%.2f\n"
                + "nos da un valor de $%.2f \n", 
            t1.obtenerLargo(),
            t1.obtenerAncho(), 
            t1.obtenerArea(),
            t1.obtenerCostoMetroCuadrado(),
            t1.obtenerCosto());
        
        System.out.println(" ");
        
        System.out.printf("El terreno 2 tiene un largo de "
                + "%.2fm. y un ancho de %.2fm.\ntiene un area total de $%.2f \n"
                + "dado el precio por metro cuadrado de $%.2f\n"
                + "nos da un valor de $%.2f \n", 
            t2.obtenerLargo(),
            t2.obtenerAncho(), 
            t2.obtenerArea(),
            t2.obtenerCostoMetroCuadrado(),
            t2.obtenerCosto());
        
        
        
    }
    
}
