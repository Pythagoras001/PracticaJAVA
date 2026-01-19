package Ejercicios.ListasEnlazadas;

class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    
    ListNode(int val) { 
        this.val = val; 
    }
    
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}

// public class PalindromeLinkedList {
//     public Boolean isPalindrome(ListNode head) {

//         List<Integer> values = new ArrayList<>();
//         ListNode current = head;
//         int iz = 0;
//         int der;


//         while (current != null) {
//             values.add(current.val);
//             current = current.next;
//         }

//         der = values.size() - 1;

//         while (iz < der) {
//             if (values.get(iz) == values.get(der)){
//                 iz ++;
//                 der --;
//                 continue;
//             }
//             return false;
//         }

//         return true;
//     }
// }

public class PalindromeLinkedList {
    public Boolean isPalindrome(ListNode head) {


        // Buscamos la mitad de la lista
        ListNode pLento = head;
        ListNode pRapido = head;

        while (pRapido != null && pRapido.next != null) {
            pLento = pLento.next;
            pRapido = pRapido.next.next;
        }

        // Invertimos la segunda mitad
        ListNode prev = null;
        ListNode nextt;

        while (pLento != null) {
            nextt = pLento.next;
            pLento.next = prev;
            prev = pLento;
            pLento = nextt;
        }

        // Comparamos desde las esquinas
        ListNode iz = head;
        ListNode der = prev;

        while (der != null) {
            if (iz.val != der.val) {
                return false;
            }
            iz = iz.next;
            der = der.next;
        }
        return true;
    }

}