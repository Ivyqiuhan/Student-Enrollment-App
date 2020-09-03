package math;

import ui.ClassesInterface;

public class MathCourse implements ClassesInterface {

    public int textbookNumber;
    public int studentNumber;
    public int tution;
    public boolean isInEnglishClass;
    public boolean paymentDue;

    public MathCourse() {
        textbookNumber = 0;
        studentNumber = 0;
        tution = 0;
        isInEnglishClass = false;
        paymentDue = false;
    }


    @Override
    public void setTextbookNum(int num) {
        textbookNumber = num;
    }

    @Override
    public void setStudentNumber(int num) {
        studentNumber = num;
    }

    @Override
    public void setTuition(int num) {
        tution = num;
    }

    @Override
    public Boolean paymentDue() {
        return paymentDue;
    }

    public int getTuition() {
        return this.tution;
    }

//    // REQUIRES: registered student
//    // MODIFIES: this
//    // EFFECTS:  return true if the tuition is due
//    public int totalPaymentDue() throws NotInClassException {
//
//        if (!isInEnglishClass) {
//            throw new NotInEnglishClassException();
//        }
//        paymentDue = true;
//        System.out.println("Student is in the class!");
//        tution++;
//        return tution;
//    }


}
