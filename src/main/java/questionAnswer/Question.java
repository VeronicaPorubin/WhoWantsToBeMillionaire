package questionAnswer;

import enums.AnswerSequence;

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

    public Answer[] getWrongAnswers() {
        Answer [] wrongAnswers = new Answer[3];
        int i =0;
        for (Answer ansWrong: answers){
            if (!ansWrong.isCorrect()){
                wrongAnswers [i] =ansWrong;
                i++;
            }
        }
        return new Answer [0];
    }


}

