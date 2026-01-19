// package Estructuras_Algoritmos;

// ============ CUANDO SE USA ============
// Considere usar el patrón de ventana deslizante para preguntas que 
// impliquen buscando una subsecuencia continua en una matriz o cadena que
// satisface a un determinado restricción.

// Si conoce la longitud de la subsecuencia que está buscando, utilice
// una ventana deslizante de longitud fija. De lo contrario, utilice una
// ventana deslizante de longitud variable.

// Ejemplos:
// - Encontrar la subcadena más grande sin repetir personajes en una cadena determinada (longitud variable).
// - Encontrar la subcadena más grande que contiene un solo carácter que se puede crear 
// reemplazando como máximo k caracteres en una cadena determinada (longitud variable).
// - Encontrar la suma más grande de una submatriz de tamaño k sin elementos duplicados
// en una matriz determinada (longitud fija).

// ============ COMPLEJIDAD ============
// O(n)

// Al practicar estos problemas, es importante pensar en la estructura 
// de datos adecuada estado para almacenar el contenido de la ventana
// actual. Asegúrate de que admita ambos:
// Agregar y quitar elementos de la ventana O(1) tiempo.
// Comprobando si la ventana es válida O(1) tiempo.
// Los diccionarios y conjuntos suelen ser las mejores opciones.

public class SlidingWindow {

    // public int variableLengthSlidingWindow(int[] nums) {
    //     Map<Integer, Integer> state = new HashMap<>(); // choose appropriate data structure
    //     int start = 0;
    //     int max_ = 0;

    //     for (int end = 0; end < nums.length; end++) {
    //          // ampliar ventana
    //          // agregar números[fin] al estado en O(1) en el tiempo

    //         while (/* el estado no es válido */) {
    //            // ventana de contrato repetidamente hasta que vuelva a ser válida
    //            // eliminar números[inicio] del estado en O(1) en el tiempo
    //             start++;
    //         }

    //         // INVARIANTE: el estado de la ventana actual es válido aquí.
    //         max_ = Math.max(max_, end - start + 1);
    //     }

    //     return max_;
    // }
    
}

// Longitud Fija

// public int fixedLengthSlidingWindow(int[] nums, int k) {
//     // elegir la estructura de datos adecuada
//     // Map<Integer, Integer> state = new HashMap<>();
//     int start = 0;
//     int max = 0;

//     for (int end = 0; end < nums.length; end++) {
//         // ampliar ventana
//         // agregar números[fin] al estado en tiempo O(1)

//         if (end - start + 1 == k) {
//             // INVARIANTE: el tamaño de la ventana es k aquí.
//             max = Math.max(max, contents of state);

//             // ventana de contrato
//             // eliminar números[inicio] del estado en tiempo O(1)
//             start++;
//         }
//     }

//     return max;
// }

