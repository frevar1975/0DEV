package IntroAlaPrograma.Ejercicio10;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

import javax.sound.midi.Soundbank;
import javax.xml.transform.Source;

public class EjercicioFinal {
    
    public static void main(String[] args)
     {
        System.out.println(reverse("Hola Mundo")); /*Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh". */
        imprimeCola(); /*Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores. */  
        imprimeColabi();/*Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones. */
        ManejoVector();/*Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final. */
             /*Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo. */
            /*respuesta : Se tendra un costo elevado computancionalmente, tendre mucho consumo de memoria, ya que un resize hace una copia */
     ManejoarrayList();/*Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento. */
     arrayintMeterDatos();/*Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle,
         recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final.
         Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno. */
 DividePorCero(4,7);  /*Crea una función DividePorCero. Esta, 
        debe generar una excepción ("throws") a su llamante del tipo ArithmeticException 
        que será capturada por su llamante (desde "main", por ejemplo).
         Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". 
         Finalmente, mostraremos en cualquier caso: "Demo de código". */

        System.out.println(Movertexto("C:/dev/In.txt","C:/dev/Out.txt")); 
        /*Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
         La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" 
         al fichero dado en "fileOut". */
     
    } 
    
    
    /**
     * 
     */
    // notbook casa
    public static String Movertexto(String In, String Out)
    {
        try{

            InputStream in = new FileInputStream(In);
            byte[]datos = in.readAllBytes();
            PrintStream out = new PrintStream(Out);
            out.write(datos);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{

        }

        return ("archivo creado");
    
    } // fin movertexto

     public static int DividePorCero(int a, int b)  {
        int resultado = 0;
        try{
            resultado = a /b ;
        } catch(ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }
        finally {
            System.out.println("Demo de codigo");
        }
        return resultado;
     }



    static public void  arrayintMeterDatos(){

        ArrayList<Integer> arrayEntero = new ArrayList<>();
       
        
        for  (int cont=0 ;cont <= 10; cont++ ){
            arrayEntero.add(cont);
            
        }
        System.out.println(arrayEntero);
        System.out.println("comienzo borrar pares");
        
        for (int i=0; i < arrayEntero.size();i++)
        {
            if (arrayEntero.get(i) instanceof Integer){
                Integer aux = (Integer) arrayEntero.get(i);
                if (aux % 2==0) {
                    arrayEntero.remove(i);
                }
            }
        
        }
        System.out.println(arrayEntero);
        
      } // final arrayintMeterDatos()

    public static String reverse(String texto) {
 
        String volcar = ""; /*variable donde almaceno el texto */
        for (int x=texto.length()-1;x>=0;x--)
        volcar = volcar + texto.charAt(x); /*recorro con un for letra or letra y lo volcamos */
        return volcar;
        
     }//fin reverse

     static public void imprimeCola()
     {
        String colaUni[]= {"Juan", "José", "Miguel","Antonio"};
        for (int i=0; i< colaUni.length; i++){
            System.out.println(colaUni[i]);
            }
     } /*final imprimecola() */

     static public void imprimeColabi()
     {
        int[][] colaBi={  {32, 87, 3, 589},
                            {12, -30, 190, 0} };
                            
                            for(int i = 0; i<colaBi.length; i++){
                                for(int j = 0; j < colaBi[i].length; j++){
                                        System.out.println("posicion "+i +"-" +j + " valor " +colaBi[i][j]);
                                        }
                                    }
     } /*final imprimecolabi() */
    
     static public void ManejoVector(){
        Vector <Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
       System.out.println("ingrese 5 elementos que son "+ vector);
       System.out.println("borrare el 2 y 3");
       vector.remove(2);
       vector.remove(3);
       System.out.println("los nuevos datos son " + vector);
     }   /*fin de manejovector() */


     static public void ManejoarrayList()
     {
       ArrayList<String> lista = new ArrayList<>();
       lista.add("elemento1");
       lista.add("elemento2");
       lista.add("elemento3");
       lista.add("elemento4");
       for (int i=0; i < lista.size(); i++){
        System.out.println("arraylist --" + lista.get(i));
       }
       
        LinkedList<String> listaEnlazada = new LinkedList<>(lista);
        for (int i=0; i < listaEnlazada.size(); i++){
            System.out.println("linkedList --" + listaEnlazada.get(i));
           }

     }   /*fin de manejovector() */

    } /* final de class */

    
        
     




/*















Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".

Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
 * 
 */