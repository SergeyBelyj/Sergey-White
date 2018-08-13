package tree;
import java.util.*;


public class Node<E extends Comparable<E>>  {
    List<Node<E>> children = new ArrayList<Node<E>>();
    final E value;
    private Node<E> root;


    public Node(final E value) {
        this.value = value;
    }

    public void addChild(Node<E> child) {
        this.children.add(child);
    }

    public List<Node<E>> leaves() {
        return this.children;
    }

    public boolean eqValue(E that) {
        return this.value.compareTo(that) == 0;  }

}