package List;

import java.util.LinkedList;

public class SListTest {
  public static void main(String[] args) {
    SLinkedList sl = new SLinkedList();
    Node<Integer> node = new Node<>(10);
    sl.addFirst(node);
    System.out.println(sl.size());
    Node<Integer> node2 = new Node<>(10);
    sl.addFirst(node);
    System.out.println(sl.size());

    LinkedList<Integer> ll = new LinkedList<>();
    ll.addFirst(10);
    ll.addFirst(20);
    System.out.println(ll);
  }
}
