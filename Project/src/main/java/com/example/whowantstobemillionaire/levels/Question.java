package com.example.whowantstobemillionaire.levels;

public class Question {
    private String question;
    private int level;
    private int score;
    private Answer[] answers;

    public Question(String question, Answer[] answers, int level, int score) {
        this.question = question;
        this.answers = answers;
        this.level = level;
        this.score = score;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Answer[] getAnswers() { return answers; }









}