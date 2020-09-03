package ui;

public interface ClassesInterface {

    // REQUIRES: registered student
    // MODIFIES: this
    // EFFECTS:  get a textbook
    void setTextbookNum(int num);

    // REQUIRES: registered student
    // MODIFIES: this
    // EFFECTS:  get the number of student in this class
    void setStudentNumber(int num);

    // REQUIRES: registered student
    // MODIFIES: this
    // EFFECTS:  get the tuition of this class
    void setTuition(int num);


    // REQUIRES: registered student
    // MODIFIES: this
    // EFFECTS:  return true if the tuition is due
    Boolean paymentDue();
}
