package leetcode;

import leetcode.util.ListNode;

/**
 * Created by zhaorunqian on 2020/8/30.
 */
public class Leetcode_82 {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode dumbHead = new ListNode(0);
        dumbHead.next = head;
        ListNode pre = dumbHead;

        while(pre.next != null) {
            ListNode q = pre.next;
            boolean needDelete = false;
            while(q.next != null) {
                if(q.next.val == q.val) {
                    needDelete = true;
                } else {
                    break;
                }
                q = q.next;
            }
            if(needDelete) {
                pre.next = q.next;
            }else {
                pre = q;
            }
        }
        return dumbHead.next;
    }
}
