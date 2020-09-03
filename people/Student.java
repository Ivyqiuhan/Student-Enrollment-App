package people;

import math.MathTopics;

import java.util.ArrayList;
import java.util.Scanner;


public class Student implements MathTopicsObserver {
    private BookInfo bookInfo = new BookInfo();
    private PersonalInfo personalInfo = new PersonalInfo();
    private StudentClassLevel studentClass = new StudentClassLevel();
    private ArrayList<MathTopics> studentMathTopic = new ArrayList<MathTopics>();

    Scanner scanner = new Scanner(System.in);
    //private String studentName;
    //private String bookNumber;
    //private int studentAge;
    //private ClassesNames classNames;


    //constructor with no parameter
    public Student() {
        bookInfo.setBookNumber("");
        personalInfo.setAge("");
        personalInfo.setName("");
        //classNames = ClassesNames.ENGLISH;
    }

    //constructor with parameter of name
    public Student(String name) {
        bookInfo.setBookNumber("");
        personalInfo.setAge("");
        personalInfo.setName(name);
        //classNames = ClassesNames.ENGLISH;
    }

    public void setName(String studentName) {
        personalInfo.setName(studentName);
    }

    public String getName() {
        return personalInfo.getName();
    }

    public void setBookNumber(String startNumber) {
        bookInfo.setBookNumber(startNumber);
    }

    public String getBookNumber() {
        return bookInfo.getBookNumber();
    }

    public String getAge() {
        return personalInfo.getAge();
    }

//    public int getNumberOfCourse() {
//        return studentMathTopic.size();
//    }

    //REQUIRES: input a string type
    //MODIFIES: this
    //EFFECTS: set student age
    public void setAge(String studentAge) {
        personalInfo.setAge(studentAge);
    }

    //MODIFIES: this
    //EFFECTS: update the student's grade level
    //         return the the class grade
    public StudentClassLevel updateStudentClassLevel(int gradeLevel) {
        studentClass.setStudentGradeLevel(gradeLevel);
        return studentClass;
    }

//    //EFFECTS: return true if student's textbook < 4
//    public Boolean needMoreBooks() {
//        return bookInfo.needMoreBooks();
//    }


    @Override
    //EFFECTS: update and print out the student's math topic
    public void update(MathTopics topics) {
        System.out.println("The math topic is: " + topics);
    }


//    //MODIFIES: this
//    //EFFECTS: return student name
//    public String getName() {
//
//        return (this.studentName);
//    }
//
//    //REQUIRES: input a string type
//    //MODIFIES: this
//    //EFFECTS: set student name
//    public void setName(String studentName) {
//
//        this.studentName = studentName;
//    }
//
//    //MODIFIES: this
//    //EFFECTS: return book number
//    public String getBookNumber() {
//
//        return (this.bookNumber);
//    }
//
//    //REQUIRES: input a string type
//    //MODIFIES: this
//    //EFFECTS: set book number
//    public void setBookNumber(String startNumber) {
//
//        this.bookNumber = startNumber;
//    }
//
//    //MODIFIES: this
//    //EFFECTS: return student age
//    public int getAge() {
//
//        return (this.studentAge);
//    }
//
//    //REQUIRES: input a string type
//    //MODIFIES: this
//    //EFFECTS: set student age
//    public void setAge(Integer studentAge) {
//
//        this.studentAge = studentAge;
//    }
//
//
//    //EFFECTS: return true if student's textbook < 4
//    public Boolean needMoreBooks() {
//        //stub
//        return false;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o == null || getClass() != o.getClass()) {
//            return false;
//        }
//
//        Student that = (Student) o;
//
//        return studentName.equals(that.studentName);
//    }
//
//    @Override
//    public int hashCode() {
//        return studentName.hashCode();
//    }



}



