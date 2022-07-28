package test;

import tinyjdk.Iterator;
import tinyjdk.LinkedList;
import tinyjdk.List;
import tinyjdk.NotFoundException;

public class LinkedListTest {

    private static <T> void printList(List<T> l) {
        Iterator<T> it = l.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws NotFoundException {
        LinkedList<Double> ll = new LinkedList<>();
        for (int i = 1; i <= 10; ++i) {
            ll.add(1.50 * i);
        }
        printList(ll);
        ll.remove(3.);
        ll.set(0, ll.get(1));
        printList(ll);
        ll.clear();
        System.out.println(ll.isEmpty());
    }
}
