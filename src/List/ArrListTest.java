package List;

import java.util.ArrayList;

public class ArrListTest {
  public static void main(String[] args) {
    ArrList<Integer> list = new ArrList<>();
    System.out.println(list.size());
    list.add(10);
    System.out.println(list.get(0));
    list.add(1, 25);
    System.out.println(list.size());
    list.add(20);
    System.out.println(list.get(1));
    list.add(30);
    list.add(40);
    list.add(50);
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i));
    }
    System.out.println();
    System.out.println(list.remove() + "가 삭제됨");
    System.out.println(list.remove() + "가 삭제됨");
    System.out.println(list.remove() + "가 삭제됨");
    System.out.println(list.remove() + "가 삭제됨");
    System.out.println(list.remove() + "가 삭제됨");
    System.out.println(list.size());

    ArrayList<Integer> alist = new ArrayList<>();
    System.out.println(alist.size());
    alist.add(10);
    alist.add(20);
    alist.add(30);
    alist.add(40);
    alist.remove(alist.size() - 1);
    alist.remove(alist.size() - 1);
    System.out.println(alist.get(0));
    System.out.println(alist.size());

  }
}
