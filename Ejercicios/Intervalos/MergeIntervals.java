package Ejercicios.Intervalos;

// import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(mergeIntervals(new int[][] {{3,5},{1,4},{7,9},{6,8}})));
    }

    public static int[][] mergeIntervals(int[][] intervals) {
        
        List<int[]> fusiones = new ArrayList<>();
        int[] ant;

        // Ordenamos los intervalos
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        fusiones.add(intervals[0]);
        
        // Recorremos los intervalos
        for (int i = 1; i < intervals.length; i++) {
            ant = fusiones.get(fusiones.size() - 1);
            if (intervals[i][0] <= ant[1]){
                fusiones.get(fusiones.size() - 1)[1] = Math.max(intervals[i][1], ant[1]);
            }else{
                fusiones.add(intervals[i]);
            }
        }
        
        return fusiones.toArray( new int[fusiones.size()][]);
    }
}
