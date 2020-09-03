package ui;

import math.MathTopics;
import model.BookNewSchedule;
import model.DeleteSchedule;
import people.Student;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class InfoPage extends JPanel {
    private JTextField name;
    private JTextField age;
    private JTextField bookNumber;
    private JComboBox<String> subject;
    private JButton book;
    private JButton change;
    private JButton delete;

    private ArrayList<Student> students = new ArrayList<Student>();

    public InfoPage() {
        JPanel organizer = new JPanel();
        organizer.setLayout(new FlowLayout());


        //construct the left panel
        JPanel left = new JPanel();
        left.setBorder(new TitledBorder(new EtchedBorder(), "Information"));
        left.setLayout(new GridLayout(4, 2));
        left.add(new Label("Name: "));
        name = new JTextField();
        name.addActionListener((event) -> {
            System.out.println(event.getActionCommand());
            System.out.println(name.getText());
        });
        left.add(name);
        left.add(new JLabel("Age: "));
        age = new JTextField();
        left.add(age);
        left.add(new JLabel("Book Number: "));
        bookNumber = new JTextField();
        left.add(bookNumber);
        left.add(new JLabel("Subject: "));


        //construct the selection
        String[] subjectString = {"SAT","Pre-Calculus"};
        subject = new JComboBox<String>(subjectString);
        left.add(subject);


        //construct the right selection of math topics
        JPanel right = new JPanel();
        right.setLayout(new BorderLayout());
        JPanel mathTopic = new JPanel();
        mathTopic.setBorder(new TitledBorder(new EtchedBorder(), "Math Topics"));
       // classTime.setLayout(new GridLayout(2, 2));
//        classTime.add(new JLabel("Start: "));
//        start = new JTextField();
//        classTime.add(start);
//        classTime.add(new JLabel("End: "));
//        end = new JTextField();
//        classTime.add(end);
        String[] topics = {"Polynomials", "Trigonometry", "Exponential", "Logarithm"};
        JComboBox<String> mathTopics = new JComboBox<>(topics);
        mathTopic.add(mathTopics);


        //construct three buttons
        JPanel buttonColumn = new JPanel();
        buttonColumn.setLayout(new GridLayout(3, 1));
        book = new JButton("Book New");
        buttonColumn.add(book);

        //when pressed the Book New button
        book.addActionListener(this::onBookNew);
//        book.addActionListener((event) -> {
//            Student student = new Student(name.getText());
//            System.out.println(student.getName());
//            BookNewSchedule newSchedule = new BookNewSchedule();
//            newSchedule.setStudentName(name.getText());
//
//            MathTopics.changeNumOfMathTopics(1);
//            System.out.println(MathTopics.getNumberOfMathTopics());
//            //schedule.setClassTime(age.getText());
//            JOptionPane.showMessageDialog(this,"Complete");
//        });
        change = new JButton("Change");
        buttonColumn.add(change);
        change.addActionListener(this::onBookNew);
        delete = new JButton("Delete");
        buttonColumn.add(delete);
        delete.addActionListener(this::onDelete);
        right.add(mathTopic,BorderLayout.PAGE_START);
        right.add(buttonColumn,BorderLayout.PAGE_END);

        organizer.add(left);
        organizer.add(right);
        add(organizer);
    }

    //delete student info
    private void onDelete(ActionEvent actionEvent) {
        Student newStudent = getStudent();
        DeleteSchedule newSchedule = new DeleteSchedule();
        // newSchedule.setStudentName(name.getText());
        newSchedule.changeStudent(newStudent);
        MathTopics.changeNumOfMathTopics(0);

        //schedule.setClassTime(age.getText());
        //JOptionPane.showMessageDialog(this,"Complete");
        JOptionPane.showMessageDialog(this,"Delete Student: \n Name: "
                + name.getText() + "\n Age: " + age.getText() + "\n Book Number: "
                + bookNumber.getText());
        students.remove(newStudent);
    }

    //get student info from user
    private Student getStudent() {
        Student newStudent = new Student(name.getText());
        System.out.println(newStudent.getName());
        newStudent.setAge(age.getText());
        System.out.println(newStudent.getAge());
        newStudent.setBookNumber(bookNumber.getText());
        System.out.println(newStudent.getBookNumber());
        return newStudent;
    }


    //add new student to the array list
    //update the student info
    //update the math topic counter
    public void onBookNew(ActionEvent event) {
        Student newStudent = getStudent();
        BookNewSchedule newSchedule = new BookNewSchedule();
       // newSchedule.setStudentName(name.getText());
        newSchedule.changeStudent(newStudent);
        MathTopics.changeNumOfMathTopics(1);

        //schedule.setClassTime(age.getText());
        //JOptionPane.showMessageDialog(this,"Complete");
        JOptionPane.showMessageDialog(this,"Student Info: \n Name: "
                + name.getText() + "\n Age: " + age.getText() + "\n Book Number: "
                + bookNumber.getText());
        students.add(newStudent);
        System.out.println("Current students on the list: " + students.size());
        System.out.println("Current counter: " + MathTopics.getNumberOfMathTopics());
    }
}
