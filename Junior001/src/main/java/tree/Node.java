package tree;
import java.util.*;


public class Node<E extends Comparable<E>>  {
    ArrayList<Node<E>> children = new ArrayList<>();
    private final E value;
    private Node<E> parent;



    public Node(final E value) {
        this.value = value;
    }

    public void add(Node<E> child) {

        this.children.add(child);
    }

    public List<Node<E>> leaves() {
        return this.children;
    }

    public boolean eqValue(E that) {
        return this.value.compareTo(that) == 0;
    }

    public Optional<Node<E>> findBy(E value) {
        return null;
    }

}