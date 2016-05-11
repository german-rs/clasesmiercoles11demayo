
import java.util.Scanner;
import java.util.Stack;


public class Principal 
{
    public static void main(String[] args)
    {
                
        Scanner leer = new Scanner(System.in);
        Ejercicio _ejercicio = new Ejercicio();
        String salir;
        
        do
        {
        int opcion;
        
        System.out.println(" ------ MENÚ GESTIÓN ------\n");
        System.out.println("\t1.- Agregar producto");
        System.out.println("\t2.- Ver productos disponibles");
        System.out.println("\t3.- Buscar productos");
        System.out.println("\t4.- Eliminar productos");
        
        System.out.print("\nIngrese opción: ");
        opcion = leer.nextInt();
        
        switch(opcion)
        {
            case 1:
                
                System.out.println("¿Cuántos productos desea agregar?:");
                int cantidad_maxima = leer.nextInt();
                _ejercicio.agregarProducto(cantidad_maxima);
                break;
                
            case 2:
                
                _ejercicio.verProducto();
                break;
                
            case 3:
                
                leer.nextLine();
                System.out.print("Ingrese el nombre del producto: ");
                String titulo = leer.nextLine();
                System.out.println(_ejercicio.buscarProducto(titulo));                
                break;
                                                
            case 4:
                 
                 System.out.println("Ingrese 1 para eliminar el último.");
                 System.err.println("Ingrese 2 para eliminar todo.");
                 opcion = leer.nextInt();
                _ejercicio.eliminarProducto(opcion);
                break;
            
            default:
                System.err.println("Opción incorrecta.");
        }
        
        leer.nextLine(); //Limpiando buffer
        System.out.println("Desea salir del programa: si | no");
        salir = leer.nextLine();
        
        }while(salir.equals("no") || salir.equals("NO") 
                || salir.equals("No") || salir.equals("nO"));
        
        
    
    }//..
    
}//.
