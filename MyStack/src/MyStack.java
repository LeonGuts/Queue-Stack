import java.util.ArrayList;

public class MyStack<T> implements Stack<T> {

    private final ArrayList<T> list = new ArrayList<>();

    @Override
    public void push(T item) {
        list.addFirst(item);
    }

    @Override
    public T pop() {
        return list.removeFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
