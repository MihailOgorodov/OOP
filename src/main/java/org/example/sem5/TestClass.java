package org.example.sem5;

public class TestClass implements Comparable<TestClass> {
    String nonStaticField;
    static String staticField;
    Integer id;

    public TestClass(Integer id) {
        this.id = id;
    }

    static void testStatic() {
        staticField = "d";

    }

    void testStaticNon() {
        nonStaticField = "";
        staticField = "";
        testStatic();
    }

    @Override
    public String toString() {
        return "TestClass{" + "id=" + id + '}';
    }

    @Override
    public int compareTo(TestClass o) {
        return id - o.id;
    }
}
