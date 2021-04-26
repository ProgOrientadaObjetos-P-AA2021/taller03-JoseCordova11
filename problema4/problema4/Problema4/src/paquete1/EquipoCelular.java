package paquete1;

/**
 *
 * @author Jose Cordova
 */
public class EquipoCelular {
    
    private String sistemaOperativo;
    
    private double tamanoPantalla;
     
    private double costo;
    
    private String direccionMac;
    
    private String imei;
    
    public void establecerSistemaOperativo(String s){
        sistemaOperativo = s;
    }
    
    public void establecertamanoPantalla(double t){
        tamanoPantalla = t;
    }
    
    public void establecerCosto(double c){
        costo = c;
    }
    
    public void establecerDireccionMac(String d){
        direccionMac = d;
    }
    
    public void establecerImei(String i){
        imei = i;
    }
    
    public String obtenerSistemaOperativo(){
        return sistemaOperativo;
    }
    
    public double obtenerTamanoPantalla(){
        return tamanoPantalla;
    }
    
    public double obtenerCosto(){
        return costo;
    }
    
    public String obtenerDireccionMac(){
        return direccionMac;
    }
    
    public String obtenerImei(){
        return imei;
    }
}
