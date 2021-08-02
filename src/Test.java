import helper.ListNode;
import helper.Helper;

import java.math.BigInteger;

public class Test {
    public static void main(String[] a) {
        ListNode result = Helper.createListNode(8,9,9,9);

        Test t = new Test();
        int[] ar = {2,3,1,1,4};
        System.out.println();
        Helper.printIntArray(t.plusOne(ar));

    }


    public int jump(int[] nums) {
        int curP = 0;
        int m = ;
    }

    public int getMax(int[] nums, int f, int t){
        int m = nums[f];
        int in = f;
        for (int i = f; i<t; ++i){
            if (nums[f]>m){
                m = nums[i];
                in = i;
            }

        }

    }


    public ListNode swap(ListNode a, ListNode b) {
        b.next = a;
        return a;
    }


}
