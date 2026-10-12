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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        if(n==0){
            return null;
        }
        if(n==1){
            return head;
        }
        if(n==2){
            return head.next;
        }
        ListNode newn=head;
        if(n>2){
            for(int i=1;i<=(n/2);i++){
                newn=newn.next;
            }
        }
        return newn;

    }
}