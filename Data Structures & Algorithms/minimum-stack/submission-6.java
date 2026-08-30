class MinStack {
    // Stack con tutti i dati
    Deque<Integer> stack;
    // Stack con i minimi
    Deque<Integer> stackMinInOrder;

    public MinStack() {
        this.stack = new ArrayDeque<>();
        this.stackMinInOrder = new ArrayDeque<>();
        // System.out.println(this);
    }

    public void push(int val) {
        stack.push(val);
        if (stackMinInOrder.isEmpty() || val <= stackMinInOrder.peek()) {
            stackMinInOrder.push(val);
        }
        // System.out.println(this);
    }

    public void pop() {
        System.out.printf(
            "stack.peek():%s, stackMinInOrder.peek():%s\n", stack.peek(), stackMinInOrder.peek());
        if (stack.peek().equals(stackMinInOrder.peek())) {
            stackMinInOrder.pop();
        }
        stack.pop();
        // System.out.println(this);
    }

    public int top() {
        // System.out.println(this);
        return stack.peek();
    }

    public int getMin() {
        // System.out.println(this);
        return stackMinInOrder.peek();
    }

    public String toString() {
        return String.format("[stack: %s, stackMinInOrder: %s]", stack, stackMinInOrder);
    }

    // Stack            [-100, -200, -300, -400]
    // StackMinInOrder  [-100, -200, -300, -400]
}
