package org.advanced;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        /// Basic Map Example
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 1);
        map.put("Ray", 2);
        map.put("Oswald", 3);

        System.out.println(map.get("Ray"));
        System.out.println(map.getOrDefault("New Name", 100));
        System.out.println(map.containsKey("Ray"));

        /// Adjacent List example
        Map<Integer, List<Integer>> adj = new HashMap<>();

//        if(adj.get(1) == null)
//            adj.put(1, new ArrayList<>());
//        adj.get(1).add(1);
        adj.computeIfAbsent(1, f -> new ArrayList<>()).add(2);

        System.out.println(adj);

        ///  Converting Map to Set to make iterable
        Set<Map.Entry<String, Integer>> setMap = map.entrySet();
        for (Map.Entry<String, Integer> IMap : setMap)
            System.out.println(IMap.getKey() + ": " + IMap.getValue());

        ///  Similar for set of Keys
        Set<String> keySet = map.keySet();
        for(String x: keySet)
            System.out.println(x);

        ///  TreeMap
        NavigableMap<String, Integer> tMap = new TreeMap<>();
        tMap.put("John_Tree", 1);
        tMap.put("Ray_Tree", 2);
        tMap.put("Oswald_Tree", 3);
        tMap.remove("Ray_Tree");

        System.out.println(tMap);


    }
}
