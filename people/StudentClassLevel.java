package people;

public class StudentClassLevel {

    private int startBookNum;
    private int peridNum;
    private int studnetCurrentLevel;
    private int studentGradeLevel;
    //private PersonalInfo student;

    //constructor
    public StudentClassLevel() {
        setPeridNum(0);
        setStartBookNum(0);
        setStudentGradeLevel(0);
        setStudnetCurrentLevel(0);
    }

    public int getPeridNum() {
        return peridNum;
    }

    public int getStartBookNum() {
        return startBookNum;
    }

    public int getStudentGradeLevel() {
        return studentGradeLevel;
    }

    public int getStudnetCurrentLevel() {
        return studnetCurrentLevel;
    }

    public void setPeridNum(int peridNum) {
        this.peridNum = peridNum;
    }

    public void setStartBookNum(int startBookNum) {
        this.startBookNum = startBookNum;
    }

    public void setStudentGradeLevel(int studentGradeLevel) {
        this.studentGradeLevel = studentGradeLevel;
    }

    public void setStudnetCurrentLevel(int studnetCurrentLevel) {
        this.studnetCurrentLevel = studnetCurrentLevel;
    }

//    public Boolean classMatchGradeLevel() {
//        //stub
//        return false;
//    }
//
//    public Boolean needsJumpLevel() {
//        //stub
//
//        return false;
//    }
//
//    public void updatePeriodNum() {
//        //stub
//    }
//
//    public void updateClassLevel() {
//        //stub
//    }
//
//    public void updateGradeLevel() {
//        //stub
//    }

//    public Student updateStudentInfo(String name) {
//        student.setName(name);
//        return student;
//    }
}
