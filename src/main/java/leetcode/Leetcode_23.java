package leetcode;

/**
 * Created by zhaorunqian on 2020/8/20.
 */
public class Leetcode_23 {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode head = new ListNode(0), p = head;
        boolean endFlag = false;
        while(!endFlag) {
            int minNum = Integer.MAX_VALUE;
            endFlag = true;
            int minIndex = -1;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    endFlag = false;
                    if (lists[i].val < minNum) {
                        p.next = lists[i];
                        minIndex = i;
                        minNum = lists[i].val;
                    }
                }
            }
            if (!endFlag) {
                p = p.next;
                lists[minIndex] = lists[minIndex].next;
            }
        }
        return head.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}