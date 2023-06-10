package org.example.sem5;

import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.*;

public class Main {

    private static Random random  = new Random();

    public static void main(String[] args) {
//        reflection();
//        testClass();

    }

    private static void testClass() {
        TestClass testClass = new TestClass(0);
        testClass.nonStaticField = "qwe";
        TestClass.staticField = "qwe";
//        TestClass.class;
        List<TestClass> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(new TestClass(random.nextInt(1000)));
        }

/*        Collections.sort(list);
        Collections.sort(list, new TestComparator());
        list.sort(new TestComparator());
        System.out.println(list);*/

        TestClassCollection collection = new TestClassCollection(list);

        for (TestClass aClass : collection) {
            System.out.println(aClass);
        }
    }

    private static void reflection() {
        Class<? extends Random> randomClass = random.getClass();
//        System.out.println(Arrays.toString(randomClass.getDeclaredFields()));
        for (Method declaredMethod : randomClass.getDeclaredMethods()) {
            if (declaredMethod.getName().startsWith("next")) {
                System.out.println(declaredMethod.getName());
            }
        }
    }
}
