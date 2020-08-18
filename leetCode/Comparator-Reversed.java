package com.Madina;

import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, Comparator.comparing(Student::getCgpa).reversed()
                .thenComparing(Student::getFname).thenComparing(Student::getId));

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }

}

