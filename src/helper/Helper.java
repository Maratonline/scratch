package helper;

import java.util.HashMap;

public class Helper {
    public static void printListNode(ListNode l) {
        System.out.println("PRINT THE LISTNODE");
        while (l != null) {
            System.out.print(l.val + " ");
            l = l.next;
        }
        System.out.println("THE END LISTNODE");
    }

    public static ListNode createListNode(int... d) {
        ListNode head = null;
        ListNode current = null;
        for (int i : d) {
            if (head == null) {
                head = new ListNode(i);
                current = head;
            }else {
                current.next = new ListNode(i);
                current = current.next;
            }
        }
        return head;
    }

    public static void printIntArray(int[] array){
        System.out.println("BEFORE PRINT INT ARRAY");
        for (int i : array)
            System.out.print(i+" ");
        System.out.println("\n THE END PRINT INT ARRAY");

    }
}
