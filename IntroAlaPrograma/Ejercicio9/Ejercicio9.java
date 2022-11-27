package IntroAlaPrograma.Ejercicio9;

public class Ejercicio9 {
    public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.setEdad(40);
    cliente.setNombre("freddy");
    cliente.setTelefono("3326697");
    cliente.setCredito(5000);
    System.out.println(cliente.getEdad());
    System.out.println(cliente.getNombre());
    System.out.println(cliente.getTelefono());
    System.out.println(cliente.getCredito());
    Trabajador trabajador = new Trabajador();
    trabajador.setSalario(1000);
    System.out.println(trabajador.getSalario());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private String telefono;
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
class Cliente extends Persona{
    int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}
class Trabajador extends Persona{
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
