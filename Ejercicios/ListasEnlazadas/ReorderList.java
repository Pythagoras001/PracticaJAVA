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


public class ReorderList {


    public void reorderList(ListNode head) {
        
        // Caso Base
        if (head == null || head.next == null) return;

        // Encontramos la mitad de la lista
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Invertimos la segunda mitad de la lista
        ListNode prev = null;
        ListNode actual = slow;
        ListNode next;

        while (actual != null) {
            next = actual.next;
            actual.next = prev;

            prev = actual;
            actual = next;
        }

        // Reconfiguramos las conecciones
        ListNode first = head;
        ListNode second = prev;
        ListNode temp;

        while (first.next != null) {

            temp = first.next;

            first.next = second;
            first = temp;
            temp = second.next;
            second.next = first;

            second = temp;
        }
    }
    
}