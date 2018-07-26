package tree;

import java.util.*;

public class Tree<E extends Comparable<E>> implements Iterator<E> {
    private Node<E> root;

    public Tree(E rootData) {
        root = new Node<E>(rootData);
        root.children = new ArrayList<Node<E>>();
    }

    public void add(E parent, Node<E> child) {
        root.findBy(parent);
        root.children.add(child);
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
        data.offer(this.root);
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
