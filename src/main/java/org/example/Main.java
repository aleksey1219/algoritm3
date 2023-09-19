package org.example;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int sizeArr = 100_000;
        IntegerList integerList1 = new IntegerListImpl(100_000);
        Random r = new Random();
        for (int i = 0; i < sizeArr; i++) {
            integerList1.add(r.nextInt(1_000_000) + 1);
        }
        System.out.println("stringList = " + integerList1);
        System.out.println();
        integerList1.add(58);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        IntegerList integerList2 = new IntegerListImpl();
        integerList1.integerListCopy(integerList2);
        long start1 = System.currentTimeMillis();
        System.out.println(integerList1.contains(56, "QuickSort"));
        System.out.println(System.currentTimeMillis() - start1);
        long start2 = System.currentTimeMillis();
        System.out.println(integerList1.contains(56, "MergeSort"));
        System.out.println(System.currentTimeMillis() - start2);
    }
}