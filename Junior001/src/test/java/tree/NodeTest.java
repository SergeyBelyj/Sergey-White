package tree;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NodeTest {
    @Test
    public void when6ElFindLastThen6() {
        Tree<Integer> tree = new Tree<>(1);
        tree.add(1, new Node<>(2));
        tree.add(1, new Node<>(3));
        tree.add(1, new Node<>(4));
        tree.add(4, new Node<>(5));
        tree.add(5, new Node<>(6));
        assertThat(
                tree.findBy(6).isPresent(),
                is(true)
        );
    }

    @Test
    public void when6ElFindNotExitThenOptionEmpty() {
        Tree<Integer> tree = new Tree<>(1);
        tree.add(1, new Node<>(2));
        assertThat(
                tree.findBy(7).isPresent(),
                is(false)
        );
    }

}