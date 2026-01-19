// package Estructuras_Algoritmos;

// ============ CUANDO SE USA ============
// Considere utilizar la técnica de dos puntos para preguntas 
// que impliquen buscar un par (o más) de elementos en una matriz que cumplan con ciertos criterios.

// Ejemplos:
// - Encontrar un par de elementos que sumen un objetivo determinado en una matriz.
// - Encontrar un triplete de elementos que sumen 0 en una matriz determinada.
// - Encontrar la cantidad máxima de agua que se puede retener entre dos elementos
// de la matriz que representan las alturas de las paredes.

// ============ COMPLEJIDAD ============
// O(n)

class TwoPointers {

    public static void main(String[] args) {
        
        // Creamos las varibles
        int[] lista = {1, 2, 3, 4, 5};

        // Punteros
        int iz = 0;
        int der = lista.length - 1 ;
        // Suma
        int suma = 0;
        // Valor Buscado
        int busqueda = 8;

        String respuesta = "No se encontro el par de numeros";

        // Buscamos dos numeros que sumen 7
        while (iz <= der) {
            suma = lista[iz] + lista[der];

            // Si encontramos la suma lo retormamos
            if (suma == busqueda) 
            {
                respuesta = String.format("Los numero que suman %s son %d + %d", busqueda, lista[iz], lista[der]);
                break;
            }
            // Si la suma es muy grande reducimos el pointer derecho
            else if (suma > busqueda) der--;
            // Si es muy peque;o aumentamos el pointer izquierdo
            else iz++;   
        }

        System.out.println(respuesta);
    }
}