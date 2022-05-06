package main.java.questionAnswer;

public class Question {
    private String question;
    private int level;
    private int score;
    Answer answers[];


    public Question(String question, int level, int score, Answer[] answer) {
        this.question = question;
        this.level = level;
        this.score = score;
        this.answers = answer;

    }


    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer[] getAnswer() {
        return answers;
    }

    public void setAnswer(Answer[] answer) {
        this.answers = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion() {
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


public Answer getVerifyAns (AnswerSequence answerSequence){
        for(Answer ansVerify : answers){
            if (ansVerify.isCorrect()){}
        }
        return getVerifyAns(answerSequence);
}


    public Answer getCorrectAnswer() {
        for (Answer ans: answers){
        if (getCorrectAnswer().isCorrect()) {
            System.out.println("");}
        }
        return getCorrectAnswer();
    }

    public Answer[] getWrongAnswers() {
        return getWrongAnswers();
    }


}

