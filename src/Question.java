
public class Question {
    private String question;
    private int level;
    private int score;
   Answer answerOne;
   Answer answerTwo;
    Answer answerThree;
   Answer answerFour;

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

