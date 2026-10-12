# Lista Doble Enlace - TDA con Nodos Bidireccional

## Descripción

Proyecto académico de Estructuras de Datos que implementa una Lista Doble Enlazada con nodos bidireccionales en Java. Gestiona objetos Persona mediante operaciones de inserción, eliminación, búsqueda y consulta por inicio, final y posición, con una interfaz gráfica Swing tipo venta de boletos.

## Estructura del proyecto

- `back_end/`
  - `Nodo.java`: Nodo con un dato, un puntero al siguiente y un puntero al anterior.
  - `Persona.java`: Modelo de datos (id, nombre, apellidos, edad, CURP, teléfono).
  - `ListaSimple.java`: TDA con las operaciones de la lista doble enlazada (referencias `primero` y `ultimo`).
- `front_end/`
  - `VentanaPrincipal.java`: Interfaz gráfica Swing para interactuar con la lista.

## Operaciones disponibles

- **Insertar**: al inicio, al final y en una posición.
- **Remover**: al inicio, al final y por posición.
- **Mostrar**: el inicio, el final y un elemento por posición.
- **Buscar**: por valor (ID) y por posición.
- **Recorrer**: hacia adelante (primero a ultimo) y hacia atrás (ultimo a primero).
- **Estado**: verificar si está vacía, obtener el tamaño y vaciar la lista.
