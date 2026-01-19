package Ejercicios.StackPila;
import java.util.Stack;
import java.util.Collections;

public class DecodeString {
    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));
    }  

    public static String decodeString(String s) {

        String cadena = "";

        // Cramos las varibles
        Stack<Character> pila = new Stack<>();

        // Llenamos la pila
        for (char simbolo : ('['+s+']').toCharArray()) {
            if (simbolo != ']'){
                pila.push(simbolo);

            }else{
                while (pila.peek() != '[' && !pila.isEmpty()) {
                    if (Character.isDigit(pila.peek())){
                        cadena = String.join("", Collections.nCopies(pila.peek() - '0', cadena));
                    }
                    else
                    {
                        cadena = pila.peek() + cadena;
                    }
                    pila.pop();
                }
                pila.pop();
            }
        }

        return cadena;
    }

} 
