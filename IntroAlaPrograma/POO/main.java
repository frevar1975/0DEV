package IntroAlaPrograma.POO;

public class main {
    public static void main(String[] args) {
        SmartDevice smartdevice =  new SmartDevice("apple", "telefono");
        SmartPhone smartphone = new SmartPhone("BIG", "negro");
        SmartWatch smartwatch = new SmartWatch("cuero", "IOS");

        System.out.println(smartdevice.marca);
        System.out.println(smartphone.tamano);
        System.out.println(smartwatch.sistemaoperativo);
    }
}
