import java.util.ArrayList;

public class MyQueue<T> implements Queue<T> {

    private final ArrayList<T> list = new ArrayList<>();


    @Override
    public void add(T item) {
        list.add(item);
    }

    @Override
    public T remove() {
        return list.removeFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
