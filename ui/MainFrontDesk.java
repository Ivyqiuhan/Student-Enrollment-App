package ui;

import javax.swing.*;
import java.io.IOException;

public class MainFrontDesk {

    //main method
    //EFFECTS: set student name
    public static void main(String[] args) throws IOException {

        JFrame frame = new JFrame();
        frame.setTitle("TOOLS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Page());
        //frame.setSize(1000,1000);
        frame.pack();
        frame.setVisible(true);

        //********************************************************

//        FrontDesk frontDesk = new FrontDesk();
//        //userInput();
//        //frontDesk.printStudentInfo();
//        frontDesk.printStudentName();
//
//        try {
//            frontDesk.printTuitionBill();
//        } catch (NoPaymentDueException np) {
//            System.out.println("No Payment due!");
//        } catch (Exception np) {
//
//        } finally {
//            frontDesk.userQuit();
//        }
    }




        //************************************************

//        // instantiating Singleton class with variable x
//        Singleton x = Singleton.getInstance();
//
//        // instantiating Singleton class with variable y
//        Singleton y = Singleton.getInstance();
//
//        // instantiating Singleton class with variable z
//        Singleton z = Singleton.getInstance();
//
//        // changing variable of instance x
//        x.s = (x.s).toUpperCase();
//
//        System.out.println("String from x is " + x.s);
//        System.out.println("String from y is " + y.s);
//        System.out.println("String from z is " + z.s);
//        System.out.println("\n");
//
//        // changing variable of instance z
//        z.s = (z.s).toLowerCase();
//
//        System.out.println("String from x is " + x.s);
//        System.out.println("String from y is " + y.s);
//        System.out.println("String from z is " + z.s);
}