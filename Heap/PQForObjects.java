package Heap;
import java.util.*;
import java.util.Comparator;

public class PQForObjects {
    public static class Student implements Comparable<Student> {
        String name;
        int rank;
        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }


        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
        
    }
    public static void main(String[] args){
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("shub", 1));
        pq.add(new Student("geeta", 20));
        pq.add(new Student("meera", 5));
        pq.add(new Student("krishna", 3));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+ " -> "+pq.peek().rank);
            pq.remove();
        }
    }
}
