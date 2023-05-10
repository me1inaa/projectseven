package edu.guilford;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListAnalysis {
    public static final int NUM_STUDENTS = 5000;
    public static final int NUM_ITERATIONS = 1000000;

    public static void main(String[] args) {

        // creating the arrayList with the student objects
        List<Student> studentList = new ArrayList<Student>();

        // seeing how long it takes to add the students to the list
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < NUM_STUDENTS; i++) {
            Student student = new Student();
            studentList.add(new Student());
        }
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println("Time to add " + NUM_STUDENTS + " students to the list: " + duration + " milliseconds");

        // seeing how long it takes to sort the list
        startTime = System.currentTimeMillis();
        Collections.sort(studentList);
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println("Time to sort the list: " + duration + " milliseconds");

        // seeing how long it takes to shuffle the list
        startTime = System.currentTimeMillis();
        Collections.shuffle(studentList);
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println("Time to shuffle the list: " + duration + " milliseconds");

        // seeing how long it takes to get a random element from the list 1,000,000
        // times
        startTime = System.currentTimeMillis();
        for (int i = 0; i < NUM_ITERATIONS; i++) {
            int randomIndex = (int) (Math.random() * studentList.size());
            Student randomStudent = studentList.get(randomIndex);
        }
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println("Time to get a random element from the list " + NUM_ITERATIONS + " times: " + duration
                + " milliseconds");

        //seeing how long it takes to get each element from the lsit sequentially 
        startTime = System.currentTimeMillis();
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
        }
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println("Time to get each element from the list sequentially: " + duration + " milliseconds");

        //now we are going to test the linkedList
        System.out.println("\nTesting LinkedList: ");
        // creating the linkedList with the student objects
        List<Student> studentLinkedList = new LinkedList<Student>();

        //seeing how long it takes to add elements to the linked list 
        startTime = System.currentTimeMillis();
        for (int i = 0; i < NUM_STUDENTS; i++) {
            Student student = new Student();
            studentLinkedList.add(new Student());
        }
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println("Time to add " + NUM_STUDENTS + " students to the linked list: " + duration + " milliseconds");

        //seeing how long it takes to sort the linked list
        startTime = System.currentTimeMillis();
        Collections.sort(studentLinkedList);
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println("Time to sort the linked list: " + duration + " milliseconds");

        //seeing how long it takes to shuffle the linked list
        startTime = System.currentTimeMillis();
        Collections.shuffle(studentLinkedList);
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println("Time to shuffle the linked list: " + duration + " milliseconds");

        //seeing how long it takes to get a random element from the linked list 1,000,000 times
        startTime = System.currentTimeMillis();
        for (int i = 0; i < NUM_ITERATIONS; i++) {
            int randomIndex = (int) (Math.random() * studentLinkedList.size());
            Student randomStudent = studentLinkedList.get(randomIndex);
        }
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println("Time to get a random element from the linked list " + NUM_ITERATIONS + " times: " + duration
                + " milliseconds");

        //seeing how long it takes to get each element from the linked list sequentially
        startTime = System.currentTimeMillis();
        for (int i = 0; i < studentLinkedList.size(); i++) {
            Student student = studentLinkedList.get(i);
        }
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println("Time to get each element from the linked list sequentially: " + duration + " milliseconds");
    

    }

}
