package questionAnswer;

import enums.AnswerSequence;
import enums.HelpSequence;

public class Answer {
    private String answer;
    private boolean isCorrect;
    private AnswerSequence option;
    private HelpSequence helpsOption;

    public HelpSequence getHelpsOption() {
        return helpsOption;
    }

    public void setHelpsOption(HelpSequence helpsOption) {
        this.helpsOption = helpsOption;
    }

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



}
