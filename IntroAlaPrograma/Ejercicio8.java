package IntroAlaPrograma;

public class Ejercicio8 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(40);
        System.out.println(persona.getEdad());
        persona.setNombre("freddy");
        System.out.println(persona.getNombre());
        persona.setTelefono("3399555");
        System.out.println(persona.getTelefono());
    }
}
class  Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad (int edad){
        this.edad = edad;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public void setTelefono (String telefono){
        this.telefono = telefono;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }
}

