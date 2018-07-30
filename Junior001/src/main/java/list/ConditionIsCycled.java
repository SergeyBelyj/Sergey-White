package list;

public class ConditionIsCycled {

    NodeOther first = new NodeOther(1);
    NodeOther two = new NodeOther(2);
    NodeOther third = new NodeOther(3);
    NodeOther four = new NodeOther(4);
    public void qwe() {
        first.next = two;
        two.next = third;
        third.next = four;
        four.next = first;
    }
    boolean hasCycle(NodeOther first) {
        boolean res = true;
        while (true) {
            if (first.next.value == first.next.next) {

            }
        }
    }
}
