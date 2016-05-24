

package clasemiercoles11demayo;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author germanriveros
 */
public class EjerciciosCasa
{
    
    protected Scanner leer;
    
    public void E_1()
    {
        
        //Pendiente...
    }
    
    public void E_2()
    {
        
        Stack<Integer> aleatoriosDos = new Stack<>();
        Stack<Integer> aleatorios = new Stack<>();
        int temp;
        
        for (int i = 0; i < 30; i++) 
        {
         
            temp = (int) (Math.random() * 1000);
            
                aleatorios.add(temp);
        }
        
        System.out.println("Elementos (pila aleatorios): \n" + aleatorios);
        
        Collections.sort(aleatorios); //ordenando...
        
        System.out.println("\nElementos ordenados: \n" + aleatorios);
        
        aleatoriosDos.addAll(aleatorios); // añadiendo todos...
        
        System.out.println("\nElementos (pila aleatoriosDos): \n" + 
                aleatoriosDos);
   
        
        if(aleatorios.containsAll(aleatoriosDos))
        
            System.out.println("\nVerdadero: Poseen los mismos elementos");
        
        else System.out.println("\nFalso: son diferentes");   
             
        
    }//..   
    
    public void E_3()
    {
        
        Stack<Double> decimales = new Stack<>();
        leer = new Scanner(System.in);
        double mayor = 0;
        double sum = 0;
        double aux;
        
        for (int i = 0; i < 5; i++)
        {
            
            System.out.println("Ingrese número decimal: ");
                aux = leer.nextDouble();               
                    decimales.add(aux);
        }
        
        System.out.println("\nElementos:" + decimales);
        
        //Traspasando a vector
        Double[] vector = decimales.toArray(new Double[0]);
        
        //determinando la media...
        for (int i = 0; i < vector.length; i++) sum += vector[i];
        
        System.out.println("La media es: " + (sum / vector.length));
        
        
        //determinando el mayor...
        for (int i = 0; i < vector.length; i++)
               
            if(mayor < vector[i]) mayor = vector[i];
            
        System.out.println("El mayor es: " + mayor);
        
        
    }//..
    

    
    public void E_4()
    {
        leer = new Scanner(System.in);
        OrdenaCanciones oc;
        int opcion;
        
        oc = new OrdenaCanciones(); //llamamos al constructor
        
        System.out.println("---------- MENU ----------");
        System.out.println("1.- Ordenar canciones A - Z");
        System.out.println("2.- Ordenar canciones Z - A");
        System.out.println("3.- Ordenar canciones aleatoriamente  ");
        
        System.out.println("Ingrese una opción: ");
        
        opcion = leer.nextInt();
        
        switch(opcion)
        {
            case 1:
                oc.ordenaCreciente();
                break;
                
            case 2:
                oc.ordenaDecreciente();
                break;
                
            case 3:
                oc.ordenaAleatoriamente();
                break;
                
            default:
                System.out.println("Opción incorrecta");
        }
        
        
    }//..
    
    //Inicio - Clase anidada
    private class OrdenaCanciones extends EjerciciosCasa
    {
        
        Stack<String> CANCIONES;   
        String cancion;
        
        public OrdenaCanciones()
        {
            
            leer = new Scanner(System.in);
            CANCIONES = new Stack<>();
            
            for (int i = 0; i < 5; i++) 
            {
                
                System.out.println("Ingrese canción: ");
                cancion = leer.nextLine();
                CANCIONES.push(cancion);
            }
            
        }
        
        protected void ordenaCreciente()
        {
            
            Collections.sort(CANCIONES);
            System.out.println("\nCreciente: \n"+CANCIONES);
            
        }
        
        protected void ordenaDecreciente()
        {
            Collections.sort(CANCIONES);
            Collections.reverse(CANCIONES);
            System.out.println("\nDecreciente: \n"+CANCIONES);
            
        }
        
        protected void ordenaAleatoriamente()
        {
                       
            Collections.shuffle(CANCIONES);
            System.out.println("\nAleatorio: \n" +CANCIONES);
        }
        
        
    }//Fin - Clase anidada

    

}//.
