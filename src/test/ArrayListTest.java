package test;

import tinyjdk.ArrayList;
import tinyjdk.List;
import tinyjdk.NotFoundException;

public class ArrayListTest {

    private static <T> void printArrayList(List<T> arr) {
        for (int i = 0; i < arr.size(); ++i) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws NotFoundException {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= 10; ++i) {
            arr.add(i);
        }
        printArrayList(arr);
        arr.remove(4);
        arr.set(0, arr.get(1));
        printArrayList(arr);
        arr.clear();
        System.out.println(arr.isEmpty());
    }
}
