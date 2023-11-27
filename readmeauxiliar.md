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

----
acomodé los atributos de libro.. el orden es: titulo, autor, genero.

hice los botones y sus acciones, lo ultimo que quedaría sería acomodar las estructuras de datos.
y lograr filtrarlas con los stream por consola. esto con la "busqueda de libros" implementada en admin y cliente.

... entonces, será que lo unico que importaba era registrar el libro y hacerlo encontrar en el stream?

// la aplicación en sí muchos controles y detalle no tiene.. solo cumple con lo más técnico.

// está el detalle para los clientes, de alquilar o devolver libros. los libros deberian estar en el listado de libros de la biblioteca (probar con libros ya cargados predefinidamente, o crearlos y visualizar el registro.)

//toca revisar la "permanencia" de los datos.

// tambien.. como buscar por autor, titulo y genero..

/////////////////////

// try/catch para que se cambie el cartel de agregar repetidos en ventanaAdmin. (solo un optionPane)

// boton y accion de devolverLibro. (se elimina de la lista de libros alquilados, se agrega nuevamente a libros de biblioteca..)

// intentar implementar streams para las busquedas (sencillo en teoria, el comportamiento es el mismo...)
//va a ser mejor, por temas de tiempo, hacer todo directamente en el buscarLibro general, con un stream..