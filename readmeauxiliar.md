admin y cliente heredan de usuario.. pero para que? no tienen nada de diferente en sus atributos.

varían las responsabilidades a la hora de buscar las cosas.. no?

cada pantalla tendría su particularidad. admin se registra. agrega y elimina libros.. cliente se registra tambien, alquila y los devuelve.

// la idea de buscarlos con los stream será la misma. que los imprima por consola.

----
// las pantallas son 3, principal - admin - cliente.
en principal se debe registrar el cliente para acceder.
admin y cliente heredan de usuario solo en logica, ya que comparten nombre y contraseña (?).
además, comparten la misma interfaz, que la implementarán en forma particular.

librería controla los registros de sus usuarios (clientes), y además gestiona los libros y todas sus acciones. (agregar, eliminar, alquilar, devolver).

faltaria la gestion de libros de parte de la libreria, los controladores para acciones dentro de las pantallas de admin y cliente.
y por ultimo, recorrer la lista de libros con los filtros que nos permiten los stream.

todo en muestra por consola.