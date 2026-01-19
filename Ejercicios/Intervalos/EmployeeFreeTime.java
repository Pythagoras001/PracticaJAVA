package Ejercicios.Intervalos;

// import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeFreeTime {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(employeeFreeTime(new int[][][] {{{2,4}, {7,10}}, {{1,5}, {6,9}}})));
    }

    public static int[][] employeeFreeTime(int[][][] schedule) {
        
        // Craemos las variables
        List<int[]> interClie = new ArrayList<>();
        List<int[]> espacioCoincide = new ArrayList<>();
        int[] ant;

        // Ordenamos los intervalo
        for (int[][] clien : schedule) {
            for (int[]  inter : clien) {
                interClie.add(inter);
            }
        }

        interClie.sort((a, b) -> Integer.compare(a[0], b[0]));
        
        // Fusionamos los intervalos y encontramos los espacios libres
        ant = interClie.get(0);

        for (int i = 1; i < interClie.size(); i ++ ){
            if (interClie.get(i)[0] <= ant[1]){
                ant[1] = Math.max(interClie.get(i)[1], ant[1]);
            }
            else{
                espacioCoincide.add(new int[] {ant[1], interClie.get(i)[0]});
                ant = interClie.get(i);
            }
        }

        return espacioCoincide.toArray(new int[espacioCoincide.size()][]);
    }
}
