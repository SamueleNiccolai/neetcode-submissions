class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.containsKey(c)) {
                if (stack.size() == 0) return false;
                if (stack.peek().equals(map.get(c))) {
                    stack.pop();
                    continue;
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        if (stack.size() > 0)
            return false;
        return true;
    }
}
