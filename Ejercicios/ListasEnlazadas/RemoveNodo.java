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

public class RemoveNodo{
    public ListNode removeNthFromEnd(ListNode head, Integer n) {

        ListNode prev = null;
        ListNode current = head;
        int longitud = 0;
        int index = 0;

        // Calculamos la longitud de la lista
        while (current != null) {
            longitud ++;
            current = current.next;
        }

        // Calculamos que nodo hay que eliminar desde el inicio
        longitud = longitud - n;

        if (longitud == 0) return head.next;

        // Eliminarmos el nodo
        current = head;
        while (current != null) {
            index ++;
            if (index == longitud + 1){
                prev.next = current.next;
                break;
            }
            prev = current;
            current = current.next;
        }        
        
        return head;
    }
}

// Usando nodo ficticio y two pointers

// public ListNode removeNthFromEnd(ListNode head, int n) {
//     ListNode dummy = new ListNode(0);
//     dummy.next = head;
    
//     ListNode fast = dummy, slow = dummy;
//     for (int i = 0; i < n; i++) {
//         fast = fast.next;
//     }
    
//     while (fast.next != null) {
//         fast = fast.next;
//         slow = slow.next;
//     }
    
//     // remove nth node from end
//     slow.next = slow.next.next;
//     return dummy.next;
// }