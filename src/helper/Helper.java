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


    /*
        * create a TreeNode from array
     */
    private TreeNode fillTreeNode(int[] n, int pos, int ind){
        if(pos>ind) return null;
        int rId = (pos+ind)/2;
        TreeNode r = new TreeNode(n[rId]);
        r.left = fillTreeNode(n, pos, rId-1);
        r.right = fillTreeNode(n, rId+1, ind);
        return r;
    }

    public static void printTreeNode(TreeNode treeNode) {
        if (treeNode != null){
        System.out.print(treeNode.val + " ");
        if (treeNode.left != null) {
            printTreeNode(treeNode.left);
            if (treeNode.right == null)
                System.out.print(" null ");
        }
        if (treeNode.right != null) {
            printTreeNode(treeNode.right);
            if (treeNode.left == null)
                System.out.print(" null ");
        }
        }



    }

    public static ListNode createListNode(int... d) {
        ListNode head = null;
        ListNode current = null;
        for (int i : d) {
            if (head == null) {
                head = new ListNode(i);
                current = head;
            } else {
                current.next = new ListNode(i);
                current = current.next;
            }
        }
        return head;
    }

    public static void printIntArray(int[] array) {
        System.out.println("BEFORE PRINT INT ARRAY");
        for (int i : array)
            System.out.print(i + " ");
        System.out.println("\n THE END PRINT INT ARRAY");

    }
}
