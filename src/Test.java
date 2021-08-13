import helper.ListNode;
import helper.Helper;
import helper.TreeNode;


import java.util.*;


public class Test {
    public static void main(String[] a) {
        ListNode result = Helper.createListNode(8, 9, 9, 9);

        Test t = new Test();
        int[] ar = {};
        int[] ab = {-1, 0, 1, 2, -1, -4};
        int dr = 1 % 2;
        //System.out.println(dr);
        ListNode[] listNodes = {Helper.createListNode(1, 4, 5), Helper.createListNode(1, 3, 4), Helper.createListNode(2, 6)};
        ListNode[] listNodes2 = {Helper.createListNode(), Helper.createListNode()};

        System.out.println(t.threeSum(ab));
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return fillTreeNode(nums, 0, nums.length - 1);
    }

    //   if (nums[i]+nums[j]+nums[k] == 0)
//            r.add(Arrays.asList(nums[i],nums[j],nums[k]));
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> r = new ArrayList<>();
        for (int i = 1; i < nums.length; ++i) {
            int j = nums.length - 1, k = 0;

            while (k < j) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    if (nums[i] != nums[k] && nums[j] != nums[i])
                        r.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    break;
                } else if (sum < 0)
                    k++;
                else if (sum > 0)
                    j--;
            }
        }
        return r;
    }

    private TreeNode fillTreeNode(int[] n, int pos, int ind) {
        if (pos > ind) return null;
        int rId = (pos + ind) / 2;
        TreeNode r = new TreeNode(n[rId]);
        r.left = fillTreeNode(n, pos, rId - 1);
        r.right = fillTreeNode(n, rId + 1, ind);
        return r;
    }


    boolean contains(String s, int small, Hashtable<String, Integer> ht) {
        Hashtable<String, Integer> buf = (Hashtable<String, Integer>) ht.clone();
        int i = 0, j = small;
        while (j <= s.length()) {
            String ser = s.substring(i, j);
            int c = buf.getOrDefault(ser, -1);
            if (c == -1)
                return false;
            if (c == 1)
                buf.remove(ser);
            else
                buf.put(ser, c - 1);
            i = j;
            j = j + small;
        }
        return buf.size() == 0;
    }


    int gpos(int[] a) {
        if (a.length == 0)
            return 0;
        return a.length / 2;
    }

    public String convertToTitle(int columnNumber) {
        StringBuilder r = new StringBuilder();
        int a = 3 / 2;
        System.out.println(a + "");
        return null;
    }


    public ListNode swap(ListNode a, ListNode b) {
        b.next = a;
        return a;
    }


}
