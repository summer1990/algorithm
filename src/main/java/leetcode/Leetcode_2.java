package leetcode;

/**
 * Created by zhaorunqian on 2020/8/17.
 */
public class Leetcode_2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        ListNode head = new ListNode(0);
        ListNode index = head;
        int jinWei = 0;
        for (ListNode p = l1, q = l2; p != null || q != null;) {
            int value = 0;
            if (p != null) {
                value += p.val;
                p = p.next;
            }
            if (q != null) {
                value += q.val;
                q = q.next;
            }
            value = value + jinWei;
            if (value >= 10) {
                value = value % 10;
                jinWei = 1;
            }else {
                jinWei = 0;
            }
            ListNode node = new ListNode(value);
            index.next = node;
            index = node;
        }

        if (jinWei == 1) {
            ListNode node = new ListNode(1);
            index.next = node;
        }
        return head.next;
    }

    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
