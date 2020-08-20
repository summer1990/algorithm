package leetcode;

/**
 * Created by zhaorunqian on 2020/8/20.
 */
public class Leetcode_25 {

    /**
     * https://leetcode-cn.com/problems/reverse-nodes-in-k-group/
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        ListNode dumpHead = new ListNode(0);
        dumpHead.next = head;

        ListNode pre = dumpHead;

        while (pre != null) {
            ListNode tail = pre;
            for (int i = 0; i < k && tail != null; i++) {
                tail = tail.next;
            }
            if (tail == null) {
                break;
            }
            ListNode p = pre.next, q = p.next, r = q.next;
            while (p != tail) {
                q.next = p;
                p = q;
                q = r;
                if (r != null) {
                    r = r.next;
                }

            }
            ListNode newPre = pre.next;
            pre.next.next = q;
            pre.next = p;
            pre = newPre;

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
