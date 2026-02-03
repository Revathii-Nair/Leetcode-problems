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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode l3 = new ListNode();
14        ListNode temp = l3;
15        int carry,sum,num;
16        carry = sum = 0;
17        while(l1!=null || l2!=null ||carry!=0 ){
18            sum = carry;
19            if(l1!=null){
20                sum += l1.val;
21                l1=l1.next;
22            }
23            if(l2!=null){
24                sum += l2.val;
25                l2 = l2.next;
26            }
27            num = sum %10;
28            carry = sum/10;
29            temp.next = new ListNode(num);
30            temp= temp.next;
31        }
32        return l3.next;
33    }
34}