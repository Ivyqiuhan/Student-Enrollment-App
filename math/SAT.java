package math;


//Leaf
public class SAT extends MathTopics {

    public SAT(String topics) {
        super(topics);
    }

    @Override
    // EFFECTS: count how often the topic is used
    public void topicCounter(String theTopic) {
        if (this.topics == theTopic) {
            counter++;
        }
    }

}
