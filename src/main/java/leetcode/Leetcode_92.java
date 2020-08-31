package leetcode;

import leetcode.util.ListNode;

/**
 * Created by zhaorunqian on 2020/8/30.
 */
public class Leetcode_92 {

    public ListNode reverseBetween(ListNode head, int m, int n) {

        if(m == n) {
            return head;
        }

        ListNode dumbNode = new ListNode(0);
        dumbNode.next = head;
        ListNode pre = dumbNode;

        for(int i = 0; i < m - 1; i++) {
            pre = pre.next;
        }

        ListNode p = pre.next;
        ListNode q = p.next;
        ListNode t = null;
        int count = m+1;
        while(count <= n) {
            t = q.next;
            q.next = p;
            p = q;
            q = t;
            count++;
        }

        pre.next.next = t;
        pre.next = p;

        return dumbNode.next;
    }
}
