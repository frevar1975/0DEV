package IntroAlaPrograma.Ejercicio10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;


public class Bonus {
    public static void main(String[] args) 
    {
        System.out.println(COPIARARCHIVO("C:/dev/InFinal.txt","C:/dev/OutFinal.txt"));
        System.out.println(Movertexto("C:/dev/InFinal.txt","C:/dev/OutFinal.txt"));
    }//fin del main

    public static String COPIARARCHIVO(String In, String Out)
    {
        try{

            InputStream infIN = new FileInputStream(In);
            byte[]datos = infIN.readAllBytes();
            PrintStream out = new PrintStream(Out);
            out.write(datos);
           

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{

        }

        return ("*****USO DE INPUTSTREM Y PRINTSREAM************archivo copiado");
    
    } // fin movertexto

    public static String Movertexto(String In, String Out)
    {
        ArrayList<String> lista = new ArrayList();
        ArrayList<String> listaTemp = new ArrayList();
        FileReader fr = null;
        BufferedReader br;
        HashMap<Integer, String> DatosPersonales = new HashMap<>();
        try{
            String[] datosUsario = new String[4];
            InputStream in = new FileInputStream(In);//InputStream,ArrayList, LinkedList o array. 
            byte[]datos = in.readAllBytes();
            for (byte dato : datos) {
                 System.out.print((char)dato);
            }

            fr = new FileReader(In);
            br = new BufferedReader(fr);

        //***************************************************************** */       
        // Lectura del fichero y meterlo a un arraylist
        //***************************************************************** */
                String linea;
                while ((linea = br.readLine()) != null) {
                    lista.add(linea);
                }
                    in.close();

                        System.out.println("");
                 System.out.println("Pase datos del fichero a un arraylist --->" + lista);
       //***************************************************************** */
        // paso el arralist a linkelist
        //***************************************************************** */

                LinkedList<String> listaEnlazada = new LinkedList<>(lista);
                for (int i=0; i < listaEnlazada.size(); i++){
                    System.out.println("linkedList --" + listaEnlazada.get(i));
                }
        
          //***************************************************************** */
          //**********ADICIONO UN ELEMETO AL LINKELIST* LA EDAD*********************** */
        //***************************************************************** */
        listaEnlazada.add("EDAD 47");
        System.out.println("********* adicione edad***********");
        System.out.println("********* Nueva Linkelist***********");
        for (int i=0; i < listaEnlazada.size(); i++){
            System.out.println("linkedList --" + listaEnlazada.get(i));
        }
        //System.out.println(listaEnlazada);
          //***************************************************************** */
          //**********USO DE HASHMAP*********************** 
          /*HashMap<String, String> DatosPersonales = new HashMap<>();*/
          //***************************************************************** */
                
        
                for (int i=0; i < listaEnlazada.size(); i++)
                {
                DatosPersonales.put( i ,listaEnlazada.get(i));
                }
                System.out.println("el mapa se relleno ---<"+ DatosPersonales);
                
        
        //***************************************************************** */
          //**********USO DE PrintStream*********************** 
          /*recorre el hashmap*/
          /*HashMap<String, String> DatosPersonales = new HashMap<>();*/
        //***************************************************************** */
                String temporalclave ="";
                String temporalvalor="";
                for (Map.Entry elemento : DatosPersonales.entrySet())
                {
                    System.out.println(" clave " + elemento.getKey());                 
                     temporalclave = temporalclave + elemento.toString();
                }
                for (Map.Entry elemento : DatosPersonales.entrySet())
                {
                    System.out.println("valor es: " + elemento.getValue());   
                     temporalvalor= temporalvalor + elemento.toString();   
                }
                System.out.println("***********recorri el HASHMAP y lo meti a un string");
                System.out.println(temporalclave+" " +temporalvalor);
                System.out.println("****************fin del ejemplo****************");
        }//fin del try
        catch(Exception e){
            System.out.println(e.getMessage()); //excepciones,
        }
        finally{

        }

        return ("****************FREDDY VARGAS************");
    
    } // fin movertexto




}// fin del progama




/*Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones,
 un HashMap y un ArrayList, LinkedList o array. */