package paquete2;
import paquete1.InstitucionEducativa;
/**
 *
 * @author Jose Cordova
 */
public class Ejecutor {
        public static void main(String[] args) {
            
            InstitucionEducativa escuela = new InstitucionEducativa();
            InstitucionEducativa colegio = new InstitucionEducativa();
            InstitucionEducativa universidad = new InstitucionEducativa();
    
            escuela.establecerNombre("APC Escuela");
            escuela.establecerTipo("Primaria");
            escuela.establecerNumeroAlumnos(500);
            escuela.establecerNumeroDocentes(32);
            escuela.establecerNumeroSedes(2);
            
            colegio.establecerNombre("Liceo de Loja");
            colegio.establecerTipo("Secundaria");
            colegio.establecerNumeroAlumnos(700);
            colegio.establecerNumeroDocentes(47);
            colegio.establecerNumeroSedes(1);
            
            universidad.establecerNombre("Universidad Tecnica Particular de Loja");
            universidad.establecerTipo("Superior");
            universidad.establecerNumeroAlumnos(40876);
            universidad.establecerNumeroDocentes(350);
            universidad.establecerNumeroSedes(1);
            
            
            
            System.out.printf("La Institucion Educativa de nombre: %S \nes de "
                    + "educacion %S \ncuenta con %d sede \nconsta de %d alumnos,"
                    + "y %d docentes.\n\n",
                    escuela.obtenerNombre(),
                    escuela.obtenerTipo(),
                    escuela.obtenerNumeroSedes(),
                    escuela.obtenerNumeroAlumnos(), 
                    escuela.obtenerNumeroDocentes());
            
            System.out.printf("La Institucion Educativa de nombre: %S \nes de "
                    + "educacion %S \ncuenta con %d sede \nconsta de %d alumnos,"
                    + "y %d docentes.\n\n",
                    colegio.obtenerNombre(),
                    colegio.obtenerTipo(),
                    colegio.obtenerNumeroSedes(),
                    colegio.obtenerNumeroAlumnos(), 
                    colegio.obtenerNumeroDocentes());
            
            System.out.printf("La Institucion Educativa de nombre: %S \nes de "
                    + "educacion %S \ncuenta con %d sede \nconsta de %d alumnos,"
                    + "y %d docentes.\n\n",
                    universidad.obtenerNombre(),
                    universidad.obtenerTipo(),
                    universidad.obtenerNumeroSedes(),
                    universidad.obtenerNumeroAlumnos(), 
                    universidad.obtenerNumeroDocentes());
            
    }    
}
