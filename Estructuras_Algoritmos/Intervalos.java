////////////// Fusionar Intervalos /////////////////

// Cuando un intervalo se superpone con el intervalo anterior en 
// una lista de intervalos ordenados por horas de inicio, se pueden
// fusionar en un solo intervalo.

// Para fusionar un intervalo en un intervalo anterior, 
// configuramos la hora de finalización del intervalo anterior 
// como el máximo de cualquiera de las horas de finalización.


// public int[][] mergeIntervals(int[][] intervals) {
//     Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
//     List<int[]> merged = new ArrayList<>();
        
//     for (int[] interval : intervals) {
//         if (merged.isEmpty() || interval[0] > merged.get(merged.size() - 1)[1]) {
//             merged.add(interval);
//         } else {
//             merged.get(merged.size() - 1)[1] = Math.max(interval[1], merged.get(merged.size() - 1)[1]);
//         }
//     }

//     return merged.toArray(new int[merged.size()][]);
// }

