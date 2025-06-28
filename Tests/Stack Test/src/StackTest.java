public class StackTest {
    public static void main(String[] args) {
        testStack();
    }

    private static void testStack() {
        MyStack<Integer> stack = new MyStack<>();
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            stack.push(i);
        }
        System.out.println("\n");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
