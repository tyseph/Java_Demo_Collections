package org.advanced;

import java.util.Comparator;

public class MyComparatorClass implements Comparator<StudentMarks> {

    /// Simpler implementation can be using lambdas
    @Override
    public int compare(StudentMarks o1, StudentMarks o2) {
        return o2.getMaths() - o1.getMaths();
    }
}
