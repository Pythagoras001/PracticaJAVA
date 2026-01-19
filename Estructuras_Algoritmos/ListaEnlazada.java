
public class ListaEnlazada {

    // Asi esta definida una lista enlazada //
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


    // Asi podemos agregar elementos en una lista enlazada //
    // 1 -> 2 -> 3 -> 4
    // # visualizing linked lists
    // head = ListNode(1)
    // head.next = ListNode(2)
    // head.next.next = ListNode(3)
    // head.next.next.next = ListNode(4)


    // Asi podemos recorrer una lista enlazada (Encontrar su longitud)//
    public int findLength(ListNode head) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length += 1;
            current = current.next;
        }
        return length;
    }


    // De esta manera eliminamos un elemento en una lista enlazada
    public ListNode deleteNode(ListNode head, int target) {
        if (head.val == target) {
            return head.next;
        }
        
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            if (curr.val == target) {
                prev.next = curr.next;
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        
        return head;
    }

    // Definir un puntero Rapido y no lento (nos sirve para detectar ciclos o la mitad de la lista)
    public ListNode fastAndSlow(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    // Darle Vuelta a una lista enlazada
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

}