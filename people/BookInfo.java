package people;

public class BookInfo {
    private String bookNumber;

    public BookInfo() {
        bookNumber = "";
    }

    //MODIFIES: this
    //EFFECTS: return book number
    public String getBookNumber() {
        return (this.bookNumber);
    }

    //REQUIRES: input a string type
    //MODIFIES: this
    //EFFECTS: set book number
    public void setBookNumber(String startNumber) {
        this.bookNumber = startNumber;
    }

    //EFFECTS: return true if student needs more book
    public Boolean needMoreBooks() {
        return false;
    }

}
