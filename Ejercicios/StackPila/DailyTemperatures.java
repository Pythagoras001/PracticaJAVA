package Ejercicios.StackPila;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{65, 70, 68, 60, 55, 75, 80, 74})));
    }

    public static int[] dailyTemperatures(int[] temps) {

        // Creamos las variables
        int n = temps.length;
        int[] result = new int[n];
        Arrays.fill(result, 0);
        Stack<Integer> stack = new Stack<>();

        for (int index = 0; index < n; index++) {
            while (!stack.empty() && temps[index] > temps[stack.peek()]) {
                result[stack.peek()] = index - stack.peek();
                stack.pop();
            }
            stack.push(index);
        }

        return result;
    }
}
