package tree;

import java.util.*;

public class Tree<E extends Comparable<E>> implements Iterator<E> {
    private Node<E> root;

    public Tree(E rootData) {
        root = new Node<E>(rootData);
    }

    public void add(Node<E> parent, Node<E> child) {

        if (root.value == parent.value) {
            root.addChild(child);
        }
        else {
            Queue<Node<E>> data = new LinkedList<>();
            data.offer(this.root);
            while (!data.isEmpty()) {
                Node<E> el = data.poll();
                for (Node<E> child2 : el.leaves()) {
                    if (child2.value == parent.value) {
                        child2.children.add(child);
                        data.offer(child2);
                        break;
                    } else  data.offer(child2);
                }
            }
            }
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
