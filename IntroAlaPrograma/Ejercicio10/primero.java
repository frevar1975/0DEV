package IntroAlaPrograma.Ejercicio10;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class primero {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("meter un numero");
            String a = scanner.next();
            String b = scanner.next();
            System.out.println("entero son " + a + b);
           // InputStream fichero = new FileInputStream( "/ejemplojava/texto.txt");
            //BufferedInputStream ficherobuffer = new BufferedInputStream(fichero);
            //try {

             //   int dato = ficherobuffer.read();//int dato = fichero.read();
              //  while (dato != -1){
             //       System.out.println((char)dato);
             ///       dato = ficherobuffer.read();//fichero.read();
             ///   }
                
                //
                
                //byte[] datos = fichero.readAllBytes();

                //for (byte dato:datos){
                //    System.out.println((char)dato);
                //}
            } 
            finally{}
            //catch (IOException e ) {
                //System.out.println("no puedo leer" + e.getMessage());
            //}
           

    } 
    catch(FileNotFoundException e){
    System.out.println("mal");
    }

    }
}
