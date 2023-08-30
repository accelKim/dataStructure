package List;

public class Node<E> {
  private E item;
  private Node<E> next;

  public Node(E newItem) {
    this.item = newItem;
    this.next = null;
  }

  public Node<E> getNext() {
    return next;
  }
  public E getItem() {
    return item;
  }

  public void setNext(Node<E> newnext) {
    this.next = newnext;
  }

  public void setItem(E newitem) {
    this.item = newitem;
  }
}
