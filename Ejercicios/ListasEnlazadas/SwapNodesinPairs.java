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



public class SwapNodesinPairs {

    public static void main(String[] args) {
        
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(2);
        n1.next.next = new ListNode(3);
        n1.next.next.next = new ListNode(4);

        swapPairs(n1);

    }

    public static ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode first = prev.next;
        ListNode second;
        

        while (first != null && first.next != null) {
            second = first.next;

            prev.next = second;
            first.next = second.next;
            second.next = first;

            prev = first;
            first = prev.next;
        }

        return dummy.next;

    }
}
