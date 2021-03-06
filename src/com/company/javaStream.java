package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class javaStream {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Trevor",20,80));
        students.add(new Student("Stephanie",21,89));
        students.add(new Student("Jack",19,50));
        students.add(new Student("Eli",23,55));
        students.add(new Student("Zealot",21,45));
        students.add(new Student("Rose",20,70));
        List<Student> sortedList=students.stream().filter(student->student.mark>=70).sorted(Comparator.comparing(student->student.mark)).collect(Collectors.toList());
        sortedList.forEach(student -> {
            System.out.println(student.name+" "+student.mark);
        });
    }
    static class Student{
        private String name;
        private Integer age;
        private Integer mark;
        public Student(String name,Integer age,Integer mark){
            this.name = name;
            this.age= age;
            this.mark= mark;
        }
        /*
        Setter
         */
        public String getName() {
            return name;
        }
        public Integer getMark(){
            return mark;
        }
        public Integer getAge(){
            return age;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setMark(Integer mark){
            this.mark=mark;
        }
        public void setAge(Integer age){
            this.age=age;
        }
    }
}