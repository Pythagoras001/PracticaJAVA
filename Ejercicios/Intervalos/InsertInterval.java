package Ejercicios.Intervalos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
        
    }

    public int[][] insertIntervals(int[][] intervals, int[] newInterval) {
        
        intervals = Arrays.copyOf(intervals, intervals.length + 1);
        intervals[intervals.length - 1] = newInterval;

        // Ordemanos los intervalos
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> fusion = new ArrayList<>();
        fusion.add(intervals[0]);

        // Recorremos los intervalos
        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] < fusion.get(fusion.size() - 1)[1]){
                fusion.get(fusion.size() - 1)[1] = Math.max(intervals[i][1], fusion.get(fusion.size() - 1)[1]);
                continue;
            }
            fusion.add(intervals[i]);
        }


        int[][] matriz = fusion.toArray(new int[fusion.size()][]);

        return matriz;
    }

}
