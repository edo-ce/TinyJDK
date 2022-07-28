package test;

import tinyjdk.Pair;

public class PairTest {

    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>("Key", 34);
        System.out.println("Key: " + p.getKey());
        System.out.println("Value: " + p.getValue());
        p.setKey("NewKey");
        p.setValue(22);
        System.out.println("Key: " + p.getKey());
        System.out.println("Value: " + p.getValue());
    }
}
