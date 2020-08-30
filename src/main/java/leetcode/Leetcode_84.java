package leetcode;

import leetcode.util.ListNode;

/**
 * Created by zhaorunqian on 2020/8/30.
 */
public class Leetcode_84 {

    /**
     * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/submissions/
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre = head;
        while(pre != null && pre.next != null) {

            ListNode q = pre.next;
            while(q != null) {
                if(q.val == pre.val) {
                    q = q.next;
                } else {
                    break;
                }
            }
            pre.next = q;
            pre = q;
        }
        return head;
    }
}
