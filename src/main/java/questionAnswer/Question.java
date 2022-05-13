package questionAnswer;

import enums.AnswerSequence;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String question;
    private int level;
    private int score;
   List <Answer> answers;

    public Question(String question, int level, int score, List <Answer> answers) {
        this.question = question;
        this.level = level;
        this.score = score;
        this.answers = answers;

    }


    public void setQuestion(String question) {
        this.question = question;
    }

    public List <Answer> getAnswer() {
        return answers;
    }

    public void setAnswer(List<Answer> answers) {
        this.answers = answers;
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
        Answer gameAnswer=null;
        for(Answer ansVerify : answers){
            if (ansVerify.getOption().equals(answerSequence)){
                gameAnswer =ansVerify;
            }
        }
        return gameAnswer;
}


    public Answer getCorrectAnswer() {
        Answer correctAnswer =null;
        for (Answer ans: answers){
        if (ans.isCorrect()) {
            return ans;}
        }
        return correctAnswer;
    }

    public List<Answer> getWrongAnswers() {
        List<Answer> wrongAnswers = new ArrayList<>();
        int i =0;
        for (Answer ansWrong: answers){
            if (!ansWrong.isCorrect()){
                wrongAnswers.set(i, ansWrong);
                i++;
            }
        }
        return wrongAnswers;
    }


}

