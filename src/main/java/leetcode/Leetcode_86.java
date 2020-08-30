package leetcode;

import leetcode.util.ListNode;

/**
 * Created by zhaorunqian on 2020/8/30.
 */
public class Leetcode_86 {


    /**
     * https://leetcode-cn.com/problems/partition-list/submissions/
     * @param head
     * @param x
     * @return
     */
    public ListNode partition(ListNode head, int x) {

        ListNode ltThan = new ListNode(0);
        ListNode ltP= ltThan;
        ListNode getThan = new ListNode(0);
        ListNode getP = getThan;


        ListNode p = head;
        while(p != null) {
            if(p.val < x) {
                ltP.next = p;
                ltP = p;
            } else {
                getP.next = p;
                getP = p;
            }
            p = p.next;
        }
        getP.next = null;
        ltP.next = getThan.next;

        return ltThan.next;
    }
}
