//82. Remove Duplicates from Sorted List II
//https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/

package com.LinkedList;
public class RemoveDuplicateFroSortedListII {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {

        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        // ListNode dummyNode = new ListNode();
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null && cur.next != null){
            if(cur.val!=cur.next.val){
                pre = cur;
                cur = cur.next;
            }
            else{
                //while loop to find the last node of the dups.
                while(cur.next!=null&&cur.val==cur.next.val){
                    cur = cur.next;
                }
                if(pre!=null){
                    pre.next = cur.next;
                }
                else{ //means from starting there are duplicate
                    head = cur.next;
                }
                cur = cur.next;
            }
        }
        return head;
    }
}
