package leetcode;

/**
 * Created by zhaorunqian on 2020/8/19.
 */
public class Leetcode_19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode preWalkPoint = head, behindPoint = head;
        for (int i = 0; i < n; i++) {
            head = head.next;
        }

        if (preWalkPoint == null) {
            return head.next;
        }

        while (preWalkPoint.next != null) {
            preWalkPoint = preWalkPoint.next;
            behindPoint = behindPoint.next;
        }

        behindPoint.next = behindPoint.next.next;
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
