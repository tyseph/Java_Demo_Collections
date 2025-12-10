package org.advanced;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        /// Basic Set Examples
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(1);
        set.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(3);

        System.out.println(set);
        System.out.println(set2);

        set.addAll(set2);
        set.retainAll(set2);
        System.out.println(set);
        set.removeAll(set2);

        ///  Overriding Hash and equals methods
        List<StudentMarks> sMarks = new ArrayList<>();
        sMarks.add(new StudentMarks(10, 18));
        sMarks.add(new StudentMarks(13, 19));
        sMarks.add(new StudentMarks(16, 18));
        sMarks.add(new StudentMarks(20, 20));
        sMarks.add(new StudentMarks(10, 10));
        sMarks.add(new StudentMarks(12, 17));

        Set<StudentMarks> studentSet = new HashSet<>(sMarks);

        System.out.println(studentSet.contains(new StudentMarks(10, 18)));

        ///  TreeSet Examples
        Set<StudentMarks> treeMarks = new TreeSet<>((a, b) -> b.getPhysics() - a.getPhysics());
        treeMarks.add(new StudentMarks(10, 18));
        treeMarks.add(new StudentMarks(13, 19));
        treeMarks.add(new StudentMarks(16, 18));
        treeMarks.add(new StudentMarks(20, 20));
        treeMarks.add(new StudentMarks(10, 10));
        treeMarks.add(new StudentMarks(12, 17));

        for(StudentMarks marks: treeMarks)
            System.out.println(marks);

        ///  Floor, ceiling etc. Navigable Hashset methods
        NavigableSet<Integer> navSet = new TreeSet<>();
        navSet.add(8);
        navSet.add(3);
        navSet.add(1);
        navSet.add(0);

        for(int x: navSet)
            System.out.println(x);

        System.out.println(navSet.floor(2));
        System.out.println(navSet.ceiling(2));
        System.out.println(navSet.higher(2));
        System.out.println(navSet.lower(2));



    }
}
