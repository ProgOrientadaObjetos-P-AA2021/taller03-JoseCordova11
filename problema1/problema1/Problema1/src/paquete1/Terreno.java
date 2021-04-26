package paquete1;

/**
 *
 * @author Jose Cordova
 */
public class Terreno {
    private double costo;
    private double ancho;
    private double largo;
    private double area;
    private double costoMetroCuadrado;
    
    /*Este metdo no recibe ningun parametro ya que va a trabajar con
      los valores que ya estan guardados en otras variables dadas
      las cuales son area y costoMetroCuadrado.*/
    public void establecerCosto(){
        costo = area * costoMetroCuadrado;
    }
    
    public void establecerAncho(double a){
        ancho = a;
    }
    
    public void establecerLargo(double l){
        largo = l;
    }    
    /*Este metdo no recibe ningun parametro ya que va a trabajar con
      los valores que ya estan guardados en otras variables dadas
      las cuales son largo y ancho.*/
    public void establecerArea(){
        area = largo * ancho;
    }
    
    public void establecerCostoMetroCuadrado(double cmc){
        costoMetroCuadrado = cmc;
    }
    
    public double obtenerCosto(){
        return costo; 
    }
    
    public double obtenerAncho(){
        return ancho; 
    }
    
    public double obtenerLargo(){
        return largo; 
    }
    
    public double obtenerArea(){
        return area; 
    }
    
    public double obtenerCostoMetroCuadrado(){
        return costoMetroCuadrado; 
    }
    
}
