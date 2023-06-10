package org.example.sem5;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class TestClassCollection implements Iterable<TestClass> {

    List<TestClass> list;
    public TestClassCollection(List<TestClass> list) {
        this.list = list;
    }

    @Override
    public Iterator<TestClass> iterator() {
        return new TestIterator();
    }

    private class TestIterator implements Iterator<TestClass>{

        int position;

        @Override
        public boolean hasNext() {
            return position < list.size();
        }

        @Override
        public TestClass next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return list.get(position++);
        }
    }

}
