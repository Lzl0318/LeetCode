class MyLinkedList {

    class Node{
        int val;
        Node next;

        public Node(){}

        public Node(int val){
            this.val = val;
        }
    }

    int size;
    Node head;

    public MyLinkedList() {
        this.size = 0;
        this.head = new Node(0);
    }

    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        Node temp =  head;
        for(int i=0;i<=index;i++){
            temp = temp.next;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        Node temp = head;
        Node toadd = new Node(val);
        if(size==0){
            toadd.next = null;
        }
        else{
            toadd.next = temp.next;
        }
        temp.next = toadd;

        size++;
    }

    public void addAtTail(int val) {
        Node temp = head;
        Node toadd = new Node(val);
        for(int i=0;i<size;i++){
            temp = temp.next;
        }
        toadd.next = null;
        temp.next = toadd;

        size++;
    }

    public void addAtIndex(int index, int val) {
        Node temp = head;
        Node toadd = new Node(val);
        if(index<=0){
            addAtHead(val);
            return;
        }
        if(index==size){
            addAtTail(val);
            return;
        }
        if(index>size){
            return;
        }
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        toadd.next = temp.next;
        temp.next = toadd;

        size++;
    }

    public void deleteAtIndex(int index) {
        Node temp = head;
        if(index<0 || index>=size){
            return;
        }
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;

        size--;
    }

    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(7);
        obj.addAtHead(2);
        obj.addAtHead(1);
        //obj.addAtIndex(3,0);


        System.out.println(obj.get(1));

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
