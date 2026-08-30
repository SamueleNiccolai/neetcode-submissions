class Solution {
    public boolean isValid(String s) {
        // Map close to open
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        // Declare a Stack
        Deque stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            System.out.println(stack);
            // se è un carattere di chiusura
            if (map.containsKey(c)) {
                // se ho la corrispondente apertura
                if (stack.peek() == map.get(c)) {
                    stack.pop();
                    continue;
                } else {
                    return false;
                }
            } else {
                // se ho un carattere di apertura
                stack.push(c);
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}
