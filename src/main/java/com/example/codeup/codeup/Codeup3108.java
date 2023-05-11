package com.example.codeup.codeup;

import java.util.*;

class Student implements Comparable<Student>{
    private String testId;
    private String code;
    private String name;

    public Student(String testId, String code, String name) {
        this.testId = testId;
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.parseInt(getCode()) - Integer.parseInt(o.getCode());
    }
}

public class Codeup3108 {
    private List<Student> students = new ArrayList<>();

    public Student makeAStudent(String TestID, String codeNumber, String name){
        return new Student(TestID,codeNumber,name);
    }

    public boolean isDuplicated(Student pStudent){
        for (Student student : students){
            if(pStudent.getCode().equals(student.getCode())) return false;
        }
        return true;
    }

    public void addAStudent(Student student){
        if(isDuplicated(student) == true){
            students.add(student);
        }
    }

    public void removeStudent(Student student){
        for(int i = 0; i < students.size(); i++){
            Student st = students.get(i);
            if(st.getCode().equals(student.getCode())){
                students.remove(i);
                break;
            }
        }
    }

    public void process(String testId, String code, String name){
        Student st = makeAStudent(testId,code,name);
        switch (testId){
            case "I" :
                addAStudent(st);
                break;
            case "D" :
                removeStudent(st);
                break;
        }
    }
    public static void main(String[] args) {
        Codeup3108 codeup3108 = new Codeup3108();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            codeup3108.process(sc.next(),sc.next(),sc.next());
        }

        Collections.sort(codeup3108.students);
        for(int i = 0; i < 5; i ++){
            int idx = sc.nextInt();
            System.out.printf("%s %s\n",codeup3108.students.get(idx-1).getCode(),codeup3108.students.get(idx-1).getName());
        }
    }
}


