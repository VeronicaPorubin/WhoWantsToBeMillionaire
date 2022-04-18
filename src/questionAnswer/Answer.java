package questionAnswer;

public class Answer {
    private String answer;
    private boolean isCorrect;
     private AnswerSequence option;


    public Answer(String answer, boolean isCorrect, AnswerSequence option) {
        this.answer = answer;
        this.isCorrect = isCorrect;
        this.option = option;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public void setOption(AnswerSequence option) {
        this.option = option;
    }

    public String getAnswer() {return answer;}

    public boolean isCorrect() {return isCorrect;}

    public AnswerSequence getOption() {return option;}

public enum AnswerSequence {
        A, B, C, D

}


}
