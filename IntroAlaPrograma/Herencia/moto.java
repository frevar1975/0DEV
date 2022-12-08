package IntroAlaPrograma.Herencia;

import IntroAlaPrograma.Clases.vehiculo;



public class moto extends vehiculo{

    boolean baul;

    public moto(String fabricante, String modelo, double cc, int year, boolean sport, int speed,
            IntroAlaPrograma.Clases.motor motor, boolean baul) {
        super(fabricante, modelo, cc, year, sport, speed, motor);
        this.baul = baul;
    }

    public moto() {
    }


   
    
}
