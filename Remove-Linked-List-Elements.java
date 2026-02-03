1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeElements(ListNode head, int val) {
13        ListNode temp = new ListNode(0,head);
14        ListNode l1 = temp;
15        while(temp!=null){
16            while(temp.next!=null && temp.next.val==val){
17                temp.next = temp.next.next;            
18            }
19            temp = temp.next;    
20        }
21        return l1.next;
22    }
23}