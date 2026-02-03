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
12    public ListNode middleNode(ListNode head) {
13        ListNode temp = head;
14        int length = 0;
15        while(temp!=null){
16            length++;
17            temp = temp.next;
18        }
19        double mid = Math.floor(length/2);
20        temp = head;
21        while(temp!=null && mid!=0){
22            temp = temp.next;
23            mid--;
24        }
25        return temp;    
26    }
27}