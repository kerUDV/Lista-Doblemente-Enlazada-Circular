# Lista-Doblemente-Enlazada-Circular
UDV - Kerwin Mendez

## Descripción del TDA

Este proyecto implementa un Tipo de Dato Abstracto (TDA) de una lista doblemente enlazada circular. Una lista doblemente enlazada permite la navegación en ambas direcciones (adelante y atrás), mientras que la propiedad circular asegura que el último nodo esté conectado al primero, formando un bucle.

## Comportamiento Circular

En esta implementación, el último nodo de la lista apunta al primer nodo como su siguiente, y el primer nodo apunta al último como su anterior. Esto permite recorrer la lista indefinidamente en cualquier dirección.

## Operaciones Principales

* `insert(value)`: Inserta un nuevo nodo con el valor proporcionado al final de la lista.
* `next()`: Mueve el puntero actual al siguiente nodo en la lista.
* `previous()`: Mueve el puntero actual al nodo anterior en la lista.
* `printCurrent()`: Imprime el valor del nodo al que apunta el puntero actual.

## Instrucciones para Compilar y Ejecutar

1.  Asegúrate de tener instalado el JDK (Java Development Kit).
2.  Clona el repositorio desde GitHub.
3.  Abre una terminal y navega al directorio del proyecto.
4.  Compila los archivos `.java` usando el comando: `javac *.java`
5.  Ejecuta el programa principal con el comando: `java Main`

## Ejemplos de Ejecución (Opcional)

Puedes incluir capturas de pantalla que muestren cómo interactúa el usuario con el menú y los resultados de las operaciones.
