package Ejercicios.SlidingWindow;

public class MaxPoints {
    public static void main(String[] args) {
        System.out.println(maxScore(new int[] {2,2,2}, 2));
    }

    public static Integer maxScore(int[] cards, Integer k) {
        // Creamos estado
        int maxSum = 0;
        int ini = cards.length - k ;
        int fin;
        int sumaArray = 0;

        // Creamos el slingwindow
        for (int fin0 = cards.length - k ; fin0 < cards.length - k +  k * 2; fin0 ++){
            fin = (fin0 >= cards.length) ? fin0 % cards.length : fin0; 
            sumaArray += cards[fin];

            while (((fin < ini) ? fin + cards.length - ini + 1 : fin - ini + 1) == k) {
                maxSum = Math.max(maxSum, sumaArray);
                sumaArray -= cards[ini];
                ini ++;
                ini = (ini >= cards.length) ? ini % cards.length : ini; 
            }
        }
        return maxSum;
    }


}
