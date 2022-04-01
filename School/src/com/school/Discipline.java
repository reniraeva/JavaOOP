package com.school;

public class Discipline implements ICommentable, IEquitable {

    private String topic = "";
    public int lecturesCount;
    public int exercisesCount;

    public Discipline(String topic, int lecturesCount, int exercisesCount) {
        setTopic(topic);
        this.lecturesCount = lecturesCount;
        this.exercisesCount = exercisesCount;
    }

    public String getTopic() {
        return this.topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
    public boolean equals(Discipline other){

        return getTopic().equals(other.getTopic()) &&
                (this.lecturesCount == other.lecturesCount) &&
                (this.exercisesCount == other.exercisesCount);
    }

    @Override
    public String toString() {
        return String.format("-> Topic: %s, Number of lectures: %d, Number of exercises: %d",
                this.topic, this.lecturesCount, this.exercisesCount);
    }
}
