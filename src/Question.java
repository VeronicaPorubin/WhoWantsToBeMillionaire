
public class Question {
    private String question;
    private int level;
    private int score;
    Answer answerOne;
    Answer answerTwo;
    Answer answerThree;
    Answer answerFour;


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

    public Answer getAnswerOne() {
        return answerOne;
    }

    public void setAnswerOne(Answer answerOne) {
        this.answerOne = answerOne;
    }

    public Answer getAnswerTwo() {
        return answerTwo;
    }

    public void setAnswerTwo(Answer answerTwo) {
        this.answerTwo = answerTwo;
    }

    public Answer getAnswerThree() {
        return answerThree;
    }

    public void setAnswerThree(Answer answerThree) {
        this.answerThree = answerThree;
    }

    public Answer getAnswerFour() {
        return answerFour;
    }

    public void setAnswerFour(Answer answerFour) {
        this.answerFour = answerFour;
    }

    public Question(String question, int level, int score, Answer answerOne, Answer answerTwo, Answer answerThree, Answer answerFour) {
        this.question = question;
        this.level = level;
        this.score = score;
        this.answerOne = answerOne;
        this.answerTwo = answerTwo;
        this.answerThree = answerThree;
        this.answerFour = answerFour;
    }


}

