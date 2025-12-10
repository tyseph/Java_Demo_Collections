package org.advanced;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingDemo {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{3, 4, 5, 1, 3, 2, 7};
//        Arrays.sort(arr);
        for(int x: arr)
            System.out.println(x);
        System.out.println(arr);

        List<Integer> lst = Arrays.asList(arr);
        Collections.sort(lst, Collections.reverseOrder());
        System.out.println(lst);

    }
}
