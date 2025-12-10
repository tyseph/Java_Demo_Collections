package org.advanced;


import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);

        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q);

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);

        Deque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.addAll(stack);
        System.out.println(dq);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(1);
        pq.offer(100);
        pq.offer(3);
        pq.offer(2);

        System.out.println(pq.peek());

        List<StudentMarks> sMarks = new ArrayList<>();
        sMarks.add(new StudentMarks(10, 18));
        sMarks.add(new StudentMarks(13, 19));
        sMarks.add(new StudentMarks(16, 18));
        sMarks.add(new StudentMarks(20, 20));
        sMarks.add(new StudentMarks(10, 10));
        sMarks.add(new StudentMarks(12, 17));

        PriorityQueue<StudentMarks> pqMarks = new PriorityQueue<>((a, b) -> b.getMaths() - a.getMaths());
        for(StudentMarks studentMarks: sMarks){
            pqMarks.offer(studentMarks);
        }

        /// This won't work without comparable interface on the T class
        List<StudentMarks> top3 = new ArrayList<>();
        int index = 0;
        while (!pqMarks.isEmpty()) {
            if (index == 3) break;
            top3.add(pqMarks.poll());
            index++;
        }

        System.out.println(top3);


    }
}
