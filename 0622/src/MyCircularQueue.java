public class MyCircularQueue {
    private int[] data;
    private int head;
    private int tail;
    private int size;

    public MyCircularQueue(int k) {
        data = new int[k];
        head = -1;
        tail = -1;
        size = k;
    }

    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        if(isEmpty()){
            head = 0;
        }
        tail = (tail+1)%size;
        data[tail] = value;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        if(head==tail){
            head = -1;
            tail = -1;
            return true;
        }
        head = (head+1)%size;
        return true;
    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }
        else{
            return data[head];
        }
    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        else{
            return data[tail];
        }
    }

    public boolean isEmpty() {
        return head==-1;
    }

    public boolean isFull() {
        return (tail+1)%size==head;
    }
}
