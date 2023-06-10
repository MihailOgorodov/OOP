package org.example.sem5;

import java.util.Comparator;

public class TestComparator implements Comparator<TestClass> {
    @Override
    public int compare(TestClass o1, TestClass o2) {
        return o2.id - o1.id;
    }
}
