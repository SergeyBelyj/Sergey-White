package tree;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NodeTest {
    @Test
    public void when6ElFindLastThen6() {
        Tree<Integer> tree = new Tree<>(1);
        tree.add(new Node<>(1), new Node<>(2));
        tree.add(new Node<>(1), new Node<>(3));
        tree.add(new Node<>(1), new Node<>(4));
        tree.add(new Node<>(4), new Node<>(5));

        tree.add(new Node<>(5), new Node<>(6));
        tree.add(new Node<>(5), new Node<>(8));
        tree.add(new Node<>(6), new Node<>(7));
        assertThat(
                tree.findBy(8).isPresent(),
                is(true)
        );
    }


}