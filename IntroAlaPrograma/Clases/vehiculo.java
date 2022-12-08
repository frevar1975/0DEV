package IntroAlaPrograma.Clases;

public class vehiculo {
    protected String fabricante;
    protected String modelo ;
    protected double cc;
    protected int year;
    protected boolean sport;
    protected int speed;
    protected motor motor;

   public vehiculo(String fabricante, String modelo, double cc, int year, boolean sport, int speed,
            IntroAlaPrograma.Clases.motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }
public vehiculo () /*el constructor */
   {

   }
   
    public vehiculo (String fabricante, String modelo) /*el constructor */
   {
    this.fabricante=fabricante;
    this.modelo=modelo;
   }

   /*3. Metodo */

   public void acelear (int quantity){
    this.speed += quantity;
   }

}
