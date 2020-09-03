package math;

public abstract class MathTopics {
    protected String topics;
    protected int counter;
    private static int numberOfMathTopics = 0;

    // EFFECTS: constructs a MathTopics item with the given name
    public MathTopics(String topics) {
        this.topics = topics;
        counter = 0;
    }

    // MODIFIES: this
    // EFFECTS: count how often the topic is used
    public void topicCounter(String theTopic) {
        if (this.topics == theTopic) {
            counter++;
        }
    }

    // MODIFIES: this
    // EFFECTS:  update the counter of the number of the math topics
    public static void changeNumOfMathTopics(int change) {
        numberOfMathTopics += change;
    }

    //  EFFECTS:  get the number of math topics
    public static int getNumberOfMathTopics() {
        return numberOfMathTopics;
    }

}
