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


public class LinkedListCycle {
    public Boolean hasCycle(ListNode head) {

        ListNode pLento = head;
        ListNode pRapido = head;

        // Creamos un ciclo con el puntero rapido
        while (pRapido != null && pRapido.next != null) {
            pLento = pLento.next;
            pRapido = pRapido.next.next;
            
            if (pLento == pRapido){
                return true;
            }
        }
        return false;
    }
}