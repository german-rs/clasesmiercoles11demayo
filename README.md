# Clases miércoles 11 de mayo :books:

##Ejercicio
####De forma grupal deberá realizar el siguiente ejercicio.
######Lea y siga las siguientes instrucciones:
1. Cree un proyecto en IDE Netbeans.
2. Agregue una clase con el nombre **Principal**, dentro de esta cree el método *main*.
3. Cree otra clase con el nombre **Ejercicio** y cree otra clase con el nombre **BodegaEjercicio**.
4. En el método *main* deberá crear un menú para gestionar una “Bodega” con las siguientes opciones:
      1. Agregar producto.
      2. Ver productos disponibles.
      3. Buscar productos.
      4. Eliminar productos.

5. Para la creación del menú deberá utilizar la instrucción *switch*, y por otro lado, con la instrucción *do-while* le dará al usuario la opción de salir o continuar en el programa.
6. En cada case de la instrucción *switch* deberá llamar a los métodos de la clase **Ejercicio**.
7. En la clase **BodegaEjercicio** deberá crear una pila (stack) con el nombre **PRODUCTOS** e inicializar está con algunos valores en el constructor de la clase.
8. La clase **Ejercicio** será una sub-clase de **BodegaEjercicio**, es decir que deberá hacer una herencia entre clases. 
> _En la clase **Ejercicio** deberá realizar las operaciones correspondientes a cada método:_
10. En el método **agregarProducto** deberá añadir elementos por medio del teclado solicitando además al usuario la cantidad máxima de elementos a añadir (utilice bucle *for*).
11. En el método **verProducto**, si la pila tiene elementos deberá desplegarlos, en caso contrario mostrar un mensaje que especifique que no existen elementos.
12. En el método **buscarProducto** deberá retornar con un mensaje si existe o no el elemento solicitado.
13. En el método **eliminarProducto** deberá dar la opción de extraer el último elemento o eliminar todos, en caso de elegir este último, utilice un bucle *while* para realizar esta operación. 

## Ejercicios (Segunda Parte)
######EjerciciosSegundaParte.java
1. Cree una pila con un parámetro de tipo Integer, para 20 números aleatorios menores que 100 (random), guardándolos en el orden en que se vayan generando. Desplegar los valores de la pila, luego ordenarla de forma creciente (sort), y vuelva a mostrar por pantalla. 
2. Repetir el ejercicio anterior pero ordenando la pila de forma decreciente (reverse).  
3. Cree un ejercicio similar al primero, pero con nombres de personas, es decir el parámetro de tipo debe ser String, y los debe ordenar en forma creciente. 
4. Del ejercicio anterior utilice el método remove() y elimine algún nombre.
5. Cree otra pila con un parámetro de tipo String, y con el método addAll() agregue los nombres de pila anterior.

######EjerciciosCasa.java

1. Cree un ejercicio similar al realizado en clases (Ejercicio bodega), seleccionando algún tema de su agrado y añadiendo a este los métodos: sort, reverse, remove, addAll.
2. Busque el funcionamiento del método: containsAll(). Cree una pila con un parámetro de tipo Integer, agregue 30 números aleatorios (ramdom), ordénelos en forma creciente (sort), copie dicho elementos a otra pila (addAll) y compare (containsAll) si tienen los mismo elementos, muestre un mensaje si es verdadero o falso.
3. Cree una pila de números decimales (ingrese estos por teclado), traspase sus elementos a un vector con el método toArray(), calcule la media y determine cual es el mayor de todos.
4. Cree un programa en el que ingrese por teclado 10 de sus canciones favoritas, cree un pequeño menú para poder ordenar estas de forma creciente o decreciente.  

