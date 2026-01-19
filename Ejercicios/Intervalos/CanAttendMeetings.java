package Ejercicios.Intervalos;

import java.util.Arrays;

public class CanAttendMeetings {
    public static void main(String[] args) {
        System.out.println(canAttendMeetings(new int[][] {{10,12},{6,9},{13,15}}));
    }

    public static Boolean canAttendMeetings(int[][] intervals) {
        
        // Ordenamos los intervalos por hora de inicio
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
    
        // Iteramos sobre cada intervalo
        for (int i = 1; i < intervals.length; i ++) {
            if (intervals[i-1][1] > intervals[i][0]){
                return false;
            }
        }
        return true;
    }
}
