package leetcode;

/**
 * Created by zhaorunqian on 2020/8/20.
 */
public class Leetcode_24 {

    /**
     * https://leetcode-cn.com/problems/swap-nodes-in-pairs/
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode dumpHead = new ListNode(0);
        dumpHead.next = head;

        ListNode pre = dumpHead;

        while (pre != null) {
            ListNode p = pre.next;
            ListNode q = null;
            if (p != null) {
                q = p.next;
            }

            if (q != null) {
                p.next = q.next;
                q.next = p;
                pre.next = q;
                pre = p;
            } else {
                pre = null;
            }
        }
        return dumpHead.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
