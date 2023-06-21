//https://leetcode.com/problems/linked-list-cycle/description/
package com.LinkedList;
public class CycleDetection {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public class Solution { // Using fast and slow pointer method
        public boolean hasCycle(ListNode head) {
            ListNode fast = head;
            ListNode slow  = head;
            while(fast!= null && fast.next!=null){
                fast = fast.next.next;
                slow = slow.next;
                if(fast==slow){
                    return true;

                }
            }
            return false;
        }

        // to find the length of a cycle
        public int lengthOfCycle(ListNode head){
            ListNode fast = head;
            ListNode slow  = head;
            while(fast!= null && fast.next!=null){
                fast = fast.next.next;
                slow = slow.next;
                if(fast==slow){
                    ListNode temp = slow;
                    int length = 0;
                    do{
                        temp = temp.next;
                        length++;
                    }while(temp!=slow);
                    return length;
                }
            }
            return 0;

        }
    }

}

