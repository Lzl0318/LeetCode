import java.util.Stack;
import java.util.HashMap;
public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2){
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!stack.isEmpty()&&nums2[i]>=stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                map.put(nums2[i], -1);
            }
            else{
                map.put(nums2[i], stack.peek());
            }
            stack.push(nums2[i]);
        }
        int[] ans = new int[nums1.length];
        for(int j=0;j<nums1.length;++j){
            ans[j] = map.get(nums1[j]);
        }
        return ans;
    }
}
