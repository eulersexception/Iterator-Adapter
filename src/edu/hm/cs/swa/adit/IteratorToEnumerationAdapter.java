package edu.hm.cs.swa.adit;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;


public class IteratorToEnumerationAdapter<E> implements Enumeration<E> {

  // TODO implement: public class IteratorToEnumerationAdapter<E> implements Enumeration<E> {}
    private Iterator<E> it;

    public IteratorToEnumerationAdapter(Iterator<E> it) {
        this.it = it;
    }

    @Override
    public boolean hasMoreElements() {
        return it.hasNext();
    }

    @Override
    public E nextElement() {
        return it.next();
    }
}
