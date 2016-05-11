
import java.util.Scanner;
import java.util.Stack;

class BodegaEjercicio{
    
    protected Stack PRODUCTOS;
    
    public BodegaEjercicio(){
        
        PRODUCTOS = new Stack();
        PRODUCTOS.push("producto_1");
        PRODUCTOS.push("producto_2");
        PRODUCTOS.push("producto_3");
     
    }
    
}

public class Ejercicio extends BodegaEjercicio{
    
    private Scanner leer;

    public void agregarProducto(int cantidad_maxima)
    {
        leer = new Scanner(System.in);
        
        String libro;
                  
        for (int i = 0; i < cantidad_maxima; i++)
        {
            System.out.print("Ingrese nombre producto: ");
            libro = leer.nextLine();
            PRODUCTOS.push(libro);
        }
        
        
    }
    
    public void verProducto()
    {
        
      if(PRODUCTOS.empty()) 
          System.out.println("No hay productos");
            
        else 
          System.out.println(PRODUCTOS);
      
    }
    
    public String buscarProducto(String nombre){
        
         if(PRODUCTOS.search(nombre) == -1) return "El producto NO está";

        else return "El producto está disponible";
        
    }
    
    public void eliminarProducto(int opcion){
        
                switch(opcion)
        {
            case 1:
                
                System.out.println("Eliminando: " 
                        + PRODUCTOS.pop());
                break;
                
            case 2:
            
                while(! PRODUCTOS.empty())
                    
                    System.out.println("Eliminando: " 
                            + PRODUCTOS.pop());
                
                break;
                
            default:
                System.out.println("Ingrese 1 o 2");
                
        }
        
    }

        
}//.



