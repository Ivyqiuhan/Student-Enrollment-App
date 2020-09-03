package math;


import people.MathTopicsObserver;

import java.util.ArrayList;

public class Subject {
    private ArrayList<MathTopicsObserver> mathTopicsObservers;

    protected Subject() {
        mathTopicsObservers = new ArrayList<>();
    }


    protected void addObserve(MathTopicsObserver mathTopicsObserver) {
        mathTopicsObservers.add(mathTopicsObserver);
    }

    protected void notifyObservers(MathTopics topics) {
        for (MathTopicsObserver mathTopicsObserver : mathTopicsObservers) {
            mathTopicsObserver.update(topics);
        }
    }

}
