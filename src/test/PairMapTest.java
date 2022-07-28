package test;

import tinyjdk.Iterator;
import tinyjdk.Map;
import tinyjdk.Pair;
import tinyjdk.PairMap;
import tinyjdk.NotFoundException;

public class PairMapTest {

    private static <K, V> void printMap(Map<K, V> m) {
        Iterator<Pair<K, V>> it = m.iterator();
        while (it.hasNext()) {
            Pair<K, V> p = it.next();
            System.out.println("Key: " + p.getKey() + ", Value: " + p.getValue());
        }
        System.out.println();
    }

    public static void main(String[] args) throws NotFoundException {
        PairMap<String, Double> m = new PairMap<>();
        m.put("A", 4.8);
        m.put("B", 9.);
        m.put("C", 5.4);
        printMap(m);
        System.out.println(m.get("B"));
        System.out.println(m.get("U"));
        System.out.println(m.containsKey("A"));
        m.remove("B");
        System.out.println(m.containsValue(9.));
    }
}
