package Ejercicios.StackPila;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesesd {

    public static void main(String[] args) {
        System.out.println(isValid("()(())") );
    }

    public static Boolean isValid(String s) {
        // Creamos las variables
        Stack<Character> pila = new Stack<>();
        Map<Character, Character> parentesis = new HashMap<>();

        // Creamos el mapa de pares de caracteres
        parentesis.put(')', '('); parentesis.put(']', '['); parentesis.put('}', '{');

        // Iteramos sobre la cadena
        for (char signo : s.toCharArray()) {
            if (parentesis.containsKey(signo)){

                if (pila.isEmpty() ||  pila.peek() != parentesis.get(signo)){
                    return false;
                }

                pila.pop();

            }else{
                pila.push(signo);

            }
        }

        return pila.isEmpty();
    }
}