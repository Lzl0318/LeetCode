import java.util.Stack;
public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < tokens.length; i++) {
            if (Character.isDigit(tokens[i].charAt(tokens[i].length()-1))) {
                stack.push(tokens[i]);
            } else if (tokens[i].equals("+")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(a + b));
            } else if (tokens[i].equals("-")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(a - b));
            } else if (tokens[i].equals("*")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(a * b));
            } else if (tokens[i].equals("/")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(b / a));
            }
        }
        return Integer.parseInt(stack.pop());
    }
    public static void main(String[] args) {
        String[] tokens = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        Solution solution = new Solution();
        //solution.evalRPN(tokens);
        //System.out.println(tokens[2]);
        System.out.println(solution.evalRPN(tokens));
    }
}
