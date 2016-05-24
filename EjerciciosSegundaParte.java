
package clasemiercoles11demayo;

import java.util.Collections;
import java.util.Stack;

/**
 *
 * @author germanriveros
 */
public class EjerciciosSegundaParte 
{
    
    private Stack<Integer> numeros;
    private Stack<String> nombres;
    private int aux;
    
    
    public void _3()
    {
        nombres = new Stack<>();
        
        nombres.add("Gabriela");
        nombres.add("Carlos");
        nombres.add("Javier");
        nombres.add("Ana");
        nombres.add("Hernan");
        nombres.add("Erika");
        nombres.add("Blanca");
        nombres.add("Ines");
        nombres.add("Daniel");
        nombres.add("Felipe");
        
        
        System.out.println("Elementos de la pila: \n" + nombres);
        
        Collections.sort(nombres); //ordenando
        
        System.out.println("\nElementos ordenados: \n" + nombres);
        
        // _4() ________________________________________________
        
        System.out.println("\nEliminando: " + 
                "nombres.remove(\"Gabriela\");");
        
        nombres.remove("Gabriela"); 
        
        System.out.println("\nElementos: \n" + nombres);
        
        
        
        // _5() _________________________________________________
        
        Stack<String> otrosNombres = new Stack<>();
        
        otrosNombres.addAll(nombres); //Agregando todos...
        
        System.out.println("\nElementos de la pila otrosNombres: \n" + 
                otrosNombres);
        
    }//..
    
    public void _2()
    {
        
       numeros = new Stack<>();
        
        for (int i = 0; i < 20; i++)
        {
            
            aux = (int) (Math.random() * 100);
            
                numeros.add(aux);
        }
        
        System.out.println("Elementos de la pila: \n" + numeros);
        
 
        Collections.sort(numeros); //ordena en forma creciente
        System.out.println("\nOrden creciente: \n" + numeros);
        

        Collections.reverse(numeros);//ordena en forma decreciente
        System.out.println("\nOrden decreciente: \n" + numeros);
        
        
    }//..
    
    public void _1()
    {
        
        numeros = new Stack<>();
        
        for (int i = 0; i < 20; i++)
        {
            
            aux = (int) (Math.random() * 100);
                
                numeros.add(aux);
        }
        
        System.out.println("Elementos de la pila: \n" + numeros);
        
        
        Collections.sort(numeros);//ordena en forma creciente    
        System.out.println("Elementos ordenados: \n" + numeros);
        
        
    }//..
    
    
}//.
