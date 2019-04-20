package edu.hm.cs.swa.adit;

import java.util.ArrayList;
import java.util.List;

    public class Client {
        public static void main(String[] argv) {

            List<Integer> numbersList = new ArrayList<Integer>();

            numbersList.add(1);
            numbersList.add(2);
            numbersList.add(3);
            numbersList.add(4);

            IterateThroughArrayLists<Integer> iterateThroughArrayLists = new IterateThroughArrayLists<>(numbersList);

            System.out.println("old school for loop");
            iterateThroughArrayLists.iterateWithForLoop();
            System.out.println("short for loop");
            iterateThroughArrayLists.iterateWithShortForLoop();
            System.out.println("old school while loop");
            iterateThroughArrayLists.iterateWithWhileLoop();
            System.out.println("foreach loop");
            iterateThroughArrayLists.iterateWithForEachAndLambda();
            System.out.println("with iterator");
            iterateThroughArrayLists.iterateWithIterator();
            System.out.println("with old style enumeration through an adapter");
            iterateThroughArrayLists.enumerateList();

        }
    }
