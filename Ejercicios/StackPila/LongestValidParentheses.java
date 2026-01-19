package Ejercicios.StackPila;

import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        System.out.println(longest_valid_parentheses("((()()())"));
    }

    public static Integer longest_valid_parentheses(String s) {
        
        // Cramos las variables
        Stack<Character> pila = new Stack<>();
        int maxx = 0;
        int contador = 0;

        int s1 = 0;
        int s2 = 0;

        for (char simbolo : s.toCharArray()) {
            s1 += (simbolo == '(') ? 1 : 0;
            s2 += (simbolo == ')') ? 1 : 0;
        }

        for (Character simbolo : s.toCharArray()) {
            if (simbolo != ')'){
                if (s1 > s2){
                    contador = 0;
                    s1 --;
                }else{
                    pila.push(simbolo);  
                }
                

            }else{
                if (!pila.isEmpty()){
                    pila.pop();
                    s2 --;
                    s1 --;
                    contador ++;

                }else contador = 0;
                
                maxx = Math.max(maxx, contador);
            }
        }
        return maxx*2;
    }
}
