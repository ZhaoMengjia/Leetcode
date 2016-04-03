/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        else{
            ListNode p = head;
            ListNode q = head.next;
            p.next = null;
            while(q != null){
                ListNode r = q.next;
                q.next = p;
                p = q;
                q = r;
            }
            return p;
        }
    }
}