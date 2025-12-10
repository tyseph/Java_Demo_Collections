package org.advanced;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        /// Example for Generics and iterator and iterable
        OurGenericList<Integer> list = new OurGenericList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (int num : list) {
            System.out.println(num);
        }

        ///  List code demo and examples
        List<Integer> alist = new ArrayList<>();
        alist.add(1);
        alist.add(2);
        alist.add(3);

        List<Integer> alist2 = new ArrayList<>();
        alist2.add(1);
        alist2.add(2);
        alist2.add(3);

        // Replace object at index 1
        alist.set(1, 100);

        //Add both alists
        alist2.addAll(alist2);
        //Find index of the given number
        System.out.println(alist.indexOf(3));
        List<Integer> listCopy = alist2.subList(1, 3);
        listCopy.set(1, 99);


        System.out.println(alist2);

        /// Linked list examples
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println(linkedList);

        ListIterator<Integer> iterator = linkedList.listIterator();

        iterator.add(2);

        alist.toArray(new Integer[0]);

        System.out.println(iterator.next() + iterator.next());
    }
}