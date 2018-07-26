package tree;

import java.util.*;

public class Tree<E extends Comparable<E>> implements Iterator<E> {
    private Node<E> root;

    public Tree(E rootData) {
        root = new Node<E>(rootData);
    }

    public void add(Node<E> parent, Node<E> child) {
        if ((Integer) parent.value == (Integer) root.value) {
            root.addChild(child);

        } else if ((Integer) parent.value > (Integer) root.value) {
           int j = 0;
            for (int i = 0; i < root.children.size(); i++) {

                    if (root.children.get(i).value == parent.value) {
                        root.children.get(i).children.add(child);
                        break;
                    } else if (root.children.get(i).children.size() > 0) {
                        while (j < root.children.get(i).children.size()) {
                            if (root.children.get(i).children.get(j).value == parent.value) {
                                root.children.get(i).children.get(j).children.add(child) ;
                            }  j++;
                        }
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
