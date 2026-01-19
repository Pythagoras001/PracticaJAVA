package Ejercicios.Intervalos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonOverlapping {
    public static void main(String[] args) {
        System.out.println(nonOverlappingIntervals(new int[][] {{1,3},{5,8},{4,10},{11,13}}));
    }

    public static Integer nonOverlappingIntervals(int[][] intervals) {
    
        List<int[]> newIntervals = new ArrayList<>();

        // Ordenamos los intervalos por su hora de finalizacion
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        newIntervals.add(intervals[0]);

        // Recorremos los intervalos
        for (int i = 1; i < intervals.length; i++) {
            if (newIntervals.get(newIntervals.size() - 1)[1] <= intervals[i][0] ) 
            newIntervals.add(intervals[i]);
        }
        return intervals.length - newIntervals.size();
    }
}
