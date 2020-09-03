package people;

public class PersonalInfo {
    private String studentName;
    private String studentAge;

    public PersonalInfo() {
        studentName = "";
        studentAge = "";
    }

    //MODIFIES: this
    //EFFECTS: return student name
    public String getName() {

        return (this.studentName);
    }

    //REQUIRES: input a string type
    //MODIFIES: this
    //EFFECTS: set student name
    public void setName(String studentName) {

        this.studentName = studentName;
    }

    //MODIFIES: this
    //EFFECTS: return student age
    public String getAge() {
        return (this.studentAge);
    }

    //REQUIRES: input a string type
    //MODIFIES: this
    //EFFECTS: set student age
    public void setAge(String studentAge) {
        this.studentAge = studentAge;
    }

//    @Override
//    //override the hush code
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o == null || getClass() != o.getClass()) {
//            return false;
//        }
//
//        PersonalInfo that = (PersonalInfo) o;
//
//        return studentName.equals(that.studentName);
//    }

//    @Override
//    public int hashCode() {
//        return studentName.hashCode();
//    }


}
