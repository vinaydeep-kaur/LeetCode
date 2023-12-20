/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
 public ListNode reverseKGroup(ListNode head, int k) {
        int n = 0;
        ListNode temp = head;
        while(temp != null){
            temp  = temp.next;
            n++;
        }
        ListNode ddfd = new ListNode(3423);
        ddfd.next = head;
        ListNode firstNode = ddfd;
        ListNode tempNode = head;
        int ptr = 1;
        int kptr = 1;
        ListNode cur = head;
        ListNode prev = null;
        if(k == 1) return ddfd.next;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
           // tempNode.next = null;
            if(kptr == k){
                firstNode.next = prev;
                firstNode = tempNode;
                firstNode.next = null;
                tempNode = cur;
                kptr = 0;
                if(ptr + k > n ){
                    firstNode.next = cur;
                    //System.out.println("breaked " + ptr + " " + firstNode.val);
                    return ddfd.next;
                }
            }
            
            ptr++;
            kptr++;
        }
        return ddfd.next;
    }
    
}