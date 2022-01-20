import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {
    private Queue<Integer> q;
    private int len;
    private int sum;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        q = new LinkedList<Integer>();
        this.len = size;
        this.sum = 0;
    }

    public double next(int val) {
        if(q.size()<len){
            q.add(val);
            sum = sum + val;
        }
        else{
            sum = sum-q.remove()+val;
            q.add(val);
        }
        return sum/q.size();
    }

    public static void main(String[] args) {
        MovingAverage movingAverage = new MovingAverage(3);
        movingAverage.next(1);
        movingAverage.next(10);
        movingAverage.next(3);
        movingAverage.next(5);
    }
}
