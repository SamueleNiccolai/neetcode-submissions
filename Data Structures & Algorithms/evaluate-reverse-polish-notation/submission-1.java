class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < tokens.length; i++) {
            stack.push(getResult(stack, tokens[i]));
        }
        return stack.pop();
    }

    public int getResult(Deque<Integer> stack, String val) {
        int first = 0;
        int second = 0;
        switch (val) {
            case "+":
                second = stack.pop();
                first = stack.pop();
                return first + second;
            case "-":
                second = stack.pop();
                first = stack.pop();
                return first - second;
            case "*":
                second = stack.pop();
                first = stack.pop();
                return first * second;
            case "/":
                second = stack.pop();
                first = stack.pop();
                return first / second;
            default:
                return Integer.valueOf(val);
        }
    }
}
