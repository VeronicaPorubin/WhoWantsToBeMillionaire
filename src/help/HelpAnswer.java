package help;

import questionAnswer.Answer;

public class HelpAnswer {
Answer answer;
private double probability;

    public HelpAnswer(Answer answer, double probability) {
        this.answer = answer;
        this.probability = probability;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }
// HelpAnswer[] getHelpAnswers( );
}
