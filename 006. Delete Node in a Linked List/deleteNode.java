/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp = node;
        while(true){
            if (node.next == null){
                temp.next = null;
                break;
            }
            else{
                node.val = node.next.val;
                temp = node;
                node = node.next;
            }
        }
    }
}