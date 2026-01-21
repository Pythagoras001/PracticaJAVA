////////////////////////////////////////////////////////////
// PILA (STACK) Y COLA (QUEUE) EN JAVA
// Implementadas con ArrayDeque
////////////////////////////////////////////////////////////


////////////////////INTRODUCCIÓN////////////////////

// ArrayDeque es una estructura de datos basada en un arreglo dinámico.
// Es MÁS eficiente que Stack y LinkedList.
// Permite implementar:
// - PILA (LIFO)
// - COLA (FIFO)
//
// ❌ No permite valores null
// ❌ No es thread-safe
// ✔️ Muy rápida para operaciones en extremos


////////////////////PILA (STACK - LIFO)////////////////////
//
// LIFO = Last In, First Out
// El último elemento en entrar es el primero en salir
//
// Operaciones principales:
// push  -> insertar
// pop   -> eliminar
// peek  -> ver el tope sin eliminar
//

import java.util.ArrayDeque;
import java.util.Deque;

class PilaEjemplo {

    public static void main(String[] args) {

        // Declaración de una PILA usando ArrayDeque
        Deque<Integer> pila = new ArrayDeque<>();

        ////////////////////PUSH////////////////////
        // Inserta elementos en el tope de la pila
        pila.push(10);
        pila.push(20);
        pila.push(30);

        // Pila actual (tope → base):
        // 30
        // 20
        // 10

        ////////////////////PEEK////////////////////
        // Devuelve el elemento del tope SIN eliminarlo
        int tope = pila.peek();
        System.out.println("Tope de la pila: " + tope); // 30

        ////////////////////POP////////////////////
        // Elimina y devuelve el elemento del tope
        int eliminado = pila.pop();
        System.out.println("Elemento eliminado: " + eliminado); // 30

        ////////////////////ESTADO FINAL////////////////////
        // Pila ahora:
        // 20
        // 10
        System.out.println("Nuevo tope: " + pila.peek());

        ////////////////////EMPTY////////////////////
        boolean estaVacia = pila.isEmpty();
        System.out.println("¿Pila vacía?: " + estaVacia);
    }
}


////////////////////COLA (QUEUE - FIFO)////////////////////
//
// FIFO = First In, First Out
// El primero en entrar es el primero en salir
//
// Operaciones principales:
// offer -> insertar
// poll  -> eliminar
// peek  -> ver el primero sin eliminar
//

import java.util.Queue;

class ColaEjemplo {

    public static void main(String[] args) {

        // Declaración de una COLA usando ArrayDeque
        Queue<String> cola = new ArrayDeque<>();

        ////////////////////OFFER////////////////////
        // Inserta elementos al final de la cola
        cola.offer("Cliente 1");
        cola.offer("Cliente 2");
        cola.offer("Cliente 3");

        // Cola actual (inicio → fin):
        // Cliente 1, Cliente 2, Cliente 3

        ////////////////////PEEK////////////////////
        // Devuelve el primer elemento SIN eliminarlo
        String primero = cola.peek();
        System.out.println("Primero en la cola: " + primero);

        ////////////////////POLL////////////////////
        // Elimina y devuelve el primer elemento
        String atendido = cola.poll();
        System.out.println("Atendido: " + atendido);

        ////////////////////ESTADO FINAL////////////////////
        // Cola ahora:
        // Cliente 2, Cliente 3
        System.out.println("Siguiente: " + cola.peek());

        ////////////////////EMPTY////////////////////
        boolean estaVacia = cola.isEmpty();
        System.out.println("¿Cola vacía?: " + estaVacia);
    }
}


////////////////////MÉTODOS IMPORTANTES////////////////////

// PILA (Deque)
// push(e)   -> inserta arriba
// pop()     -> elimina arriba
// peek()    -> mira arriba
//
// COLA (Queue)
// offer(e)  -> inserta al final
// poll()    -> elimina el primero
// peek()    -> mira el primero
//
// COMUNES
// isEmpty() -> verifica si está vacía
// size()    -> cantidad de elementos


////////////////////ERRORES COMUNES////////////////////

// ❌ Usar Stack (obsoleta y lenta)
// ❌ Usar LinkedList (menos eficiente)
// ❌ Mezclar push/pop con offer/poll en la misma estructura
// ❌ Intentar insertar null (ArrayDeque no lo permite)


////////////////////CUÁNDO USAR CADA UNA////////////////////

// PILA:
// - Deshacer acciones (undo)
// - Backtracking
// - Evaluar expresiones
// - Llamadas recursivas
//
// COLA:
// - Atención por turnos
// - Procesamiento de tareas
// - BFS (búsqueda en anchura)
// - Sistemas de colas (requests, jobs)


////////////////////RESUMEN RÁPIDO////////////////////

// PILA  -> LIFO -> push / pop / peek
// COLA  -> FIFO -> offer / poll / peek
// IMPLEMENTACIÓN RECOMENDADA -> ArrayDeque
