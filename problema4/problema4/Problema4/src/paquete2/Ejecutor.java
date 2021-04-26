package paquete2;
import paquete1.EquipoCelular;
/**
 *
 * @author Jose Cordova
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        EquipoCelular celular1 = new EquipoCelular();
        EquipoCelular celular2 = new EquipoCelular();
        
        
        celular1.establecerSistemaOperativo("iOS");
        celular1.establecertamanoPantalla(6.8);
        celular1.establecerCosto(1600.70);
        celular1.establecerDireccionMac("01:2e:c3:6f:25:9g");
        celular1.establecerImei("1989782264187");
        
        celular2.establecerSistemaOperativo("Android");
        celular2.establecertamanoPantalla(5.5);
        celular2.establecerCosto(849.50);
        celular2.establecerDireccionMac("30:5f:g5:9l:f4:5q");
        celular2.establecerImei("7464453739129763");
        
        
        System.out.printf("El celular 1 tiene un sistema operativo"
                + ": %S \nSu pantalla es de %.2f \nTiene un costo de %.2f "
                + "\nLa direccion mac es: %S \nY su IMEI es: %S \n\n",
                celular1.obtenerSistemaOperativo(), 
                celular1.obtenerTamanoPantalla(),
                celular1.obtenerCosto(), 
                celular1.obtenerDireccionMac(),
                celular1.obtenerImei());
        
        System.out.println("--------------------------------------------------");
        
        System.out.printf("El celular 2 tiene un sistema operativo"
                + ": %S \nSu pantalla es de %.2f \nTiene un costo de %.2f "
                + "\nLa direccion mac es: %S \nY su IMEI es: %S \n\n",
                celular2.obtenerSistemaOperativo(), 
                celular2.obtenerTamanoPantalla(),
                celular2.obtenerCosto(), 
                celular2.obtenerDireccionMac(),
                celular2.obtenerImei());
        
        
        
    }
    
}
