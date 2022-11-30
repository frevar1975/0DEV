public class Ejercicio4 {
    /**
     * @param args
     * test
     */
    public static void main(String[] args) {

        int numeroIf = 0;
        if (numeroIf > 0) {
            System.out.println("Es positivo");
        } else if (numeroIf < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es 0");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println("Count is: " + numeroWhile);
            numeroWhile++;

        }
        numeroWhile = 0;
        do {
            System.out.println("Count is: " + numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);

        
        for (int numeroFor=0; numeroFor <3; numeroFor++){
            System.out.println("numer for is :" + numeroFor);
        }
         var  estacion ="VERANO";
        switch(estacion) {
            case "PRIMAVERA":
              // code block
              System.out.println("ES PRIMAVERA");
              break;
              case "VERANO":
              // code block
              System.out.println("ES VERANO");
              break;
              case "OTOÑO":
              // code block
              System.out.println("ES OTOÑO");
              break;
              case "INVIERNO":
              // code block
              System.out.println("ES INVIERNO");
              break;
            default:
              // code block
          }

    }
}

