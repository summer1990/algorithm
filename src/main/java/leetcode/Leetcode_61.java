package leetcode;

import leetcode.util.ListNode;

/**
 * Created by zhaorunqian on 2020/8/26.
 */
public class Leetcode_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) {
            return head;
        }

        ListNode dumpHead = new ListNode(0);
        dumpHead.next = head;
        ListNode p = dumpHead;

        int count = 0;
        while(p.next != null) {
            count++;
            p = p.next;
        }
        k = k % count;

        if(k == 0) {
            return head;
        }

        p = dumpHead;
        for(int i = 0; i < count - k; i++) {
            p = p.next;
        }
        ListNode q = p.next;
        p.next = null;
        dumpHead.next = q;
        while(q.next != null) {
            q = q.next;
        }
        q.next = head;
        return dumpHead.next;
    }
}
