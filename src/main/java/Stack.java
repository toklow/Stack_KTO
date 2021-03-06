import java.util.ArrayDeque;

public class Stack<T> {

    private ArrayDeque<T> aDeque;

    public Stack() {
        aDeque = new ArrayDeque<>();
    }

    public void Add(T newElement) {
        this.aDeque.addLast(newElement);
    }

    public T Pop() {
        return this.aDeque.pollLast();
    }

    public int Size() {
        return this.aDeque.size();
    }


}
