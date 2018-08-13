package tree;

import java.util.*;

public class Tree<E extends Comparable<E>> implements Iterator<E> {
    private Node<E> parent;
    private Optional<Node<E>> child;

    public Tree(E rootData) {
        parent = new Node<E>(rootData);
    }

    public void add(Node<E> parent, Node<E> child) {
        if (this.parent.value == parent.value) {
            this.parent.children.add(child);
        } else { this.child = findBy(parent.value);
        this.child.get().children.add(child); }
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public E next() {
        return null;
    }

    public Optional<Node<E>> findBy(E value) {
        Optional<Node<E>> rsl = Optional.empty();
        Queue<Node<E>> data = new LinkedList<>();
        data.offer(this.parent);
        while (!data.isEmpty()) {
            Node<E> el = data.poll();
            if (el.eqValue(value)) {
                rsl = Optional.of(el);
                break;
            }
            for (Node<E> child : el.leaves()) {
                data.offer(child);
            }
        }
        return rsl;
    }
}
