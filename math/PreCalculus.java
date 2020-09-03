package math;

import java.util.ArrayList;

//composite
public class PreCalculus extends MathTopics {

    private ArrayList<MathTopics> mathTopicsArrayList;

    public PreCalculus(String topics) {
        super(topics);
        mathTopicsArrayList = new ArrayList<>();
    }

    @Override
    // EFFECTS: count how often the topic is used
    public void topicCounter(String theTopic) {
        if (this.topics == theTopic) {
            counter++;
        }
    }

    // MODIFIES: this
    // EFFECTS:  add the topic to the math topic Arraylist
    public void add(MathTopics topics) {
//        display(accessory.name);
        mathTopicsArrayList.add(topics);
    }
}
