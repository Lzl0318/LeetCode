class Solution {
    public ListNode insertionSortList(ListNode head) {
        //创建哑结点，方便在头结点前插入
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        //last指针始终指向已完成排序的最后一个元素，初始时时head
        ListNode last = head;
        //curr指针指向待插入元素
        ListNode curr = head.next;
        ListNode prev = new ListNode();
        if(head==null){
            return head;
        }
        while(curr!=null){
            if(curr.val>=last.val){
                last = last.next;
                curr = last.next;
            }
            else{
                prev = dummyNode;
                while(prev.next!=null){
                    if(prev.next.val>=curr.val){
                        break;
                    }
                    else{
                        prev = prev.next;
                    }
                }
                last.next = curr.next;
                curr.next = prev.next;
                prev.next = curr;
                curr = last.next;
            }
        }
        return dummyNode.next;
    }
}
