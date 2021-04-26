package paquete2;
import paquete1.EquivalenteHora;
/**
 *
 * @author Jose Cordova
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        EquivalenteHora hora1 = new EquivalenteHora();
        EquivalenteHora hora2 = new EquivalenteHora();
        
        hora1.establecerHoras(15.30);
        hora1.establecerMinutos();
        hora1.establecerSegundos();
        hora1.establecerDias();
        
        System.out.printf("Su primera hora es: %.2f horas \nsu equivalente en "
                + "minutos es: %.2f \nen segundos es:"
                + " %.2f \ny en dias es de: %.2f \n", 
                hora1.obtenerHoras(),
                hora1.obtenerMinutos(),
                hora1.obtenerSegundos(),
                hora1.obtenerDias());
        
        System.out.println(" ");
        
        hora2.establecerHoras(09.45);
        hora2.establecerMinutos();
        hora2.establecerSegundos();
        hora2.establecerDias();
        
        System.out.printf("Su segunda hora es: %.2f horas \nsu equivalente en "
                + "minutos es: %.2f \nen segundos es:"
                + " %.2f \ny en dias es de: %.2f \n", 
                hora2.obtenerHoras(),
                hora2.obtenerMinutos(),
                hora2.obtenerSegundos(),
                hora2.obtenerDias());
        
    }
}
