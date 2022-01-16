class Solution {
    public boolean isPalindrome(ListNode head) {
        //判断特殊情况
        if(head==null || head.next==null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode curr = head;
        ListNode prev = null;
        while(fast!=null&&fast.next!=null){
            curr = slow;
            //快慢指针
            fast = fast.next.next;
            slow = slow.next;
            //借助慢指针进行三指针逆序
            curr.next = prev;
            prev = curr;
        }
        if(fast!=null){
            slow = slow.next;
        }
        //比较以slow为头结点的链表与以curr为头结点的链表是否相同
        while(slow!=null){
            if(slow.val!=curr.val){
                return false;
            }
            slow = slow.next;
            curr = curr.next;
        }
        return true;
    }
}