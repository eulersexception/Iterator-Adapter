package edu.hm.cs.swa.adit;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class IterateThroughArrayLists<T> {

    private List<T> myList;

    IterateThroughArrayLists(List<T> list) {
        myList = list;
    }

    public void iterateWithForLoop() {
        // TODO implement
        for(int i=0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

    public void iterateWithShortForLoop() {
        // TODO implement
        for(T el : myList)
            System.out.println(el);

    }

    public void iterateWithWhileLoop() {
        // TODO implement
        int i = 0;
        while(i < myList.size()) {
            System.out.println(myList.get(i++));
        }
    }

    public void iterateWithForEachAndLambda() {
        // TODO implement
        myList.forEach(System.out::println);
    }

    public void iterateWithIterator() {
        // TODO implement
        Iterator<T> it = myList.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void enumerateList() {
        // TODO implement
        Enumeration<T> it = new IteratorToEnumerationAdapter<>(myList.iterator());
        while(it.hasMoreElements())
            System.out.println(it.nextElement());
    }
}
