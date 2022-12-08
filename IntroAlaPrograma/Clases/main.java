package IntroAlaPrograma.Clases;

import IntroAlaPrograma.Herencia.moto;

public class main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        motor motorGti= new motor("GTI", 100, 6, 6);
        vehiculo formondeo = new vehiculo("ford", "modelo", 2.1, 2010, false, 0, motorGti);
        System.out.println(formondeo.fabricante);
        System.out.println(formondeo.modelo);
        formondeo.acelear(50);
        System.out.println(formondeo.speed);
        
        // herencia

        moto motoElectrica = new moto(null, null, 0, 0, false, 0, motorGti, false);
        
        //polimorfismo

        vehiculo vehiculo;

        vehiculo = new moto();
        
        
        
        
        
        );
    }
}
