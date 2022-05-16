package help;

import questionAnswer.Answer;
import questionAnswer.Question;

import java.util.Random;

public class HelpAnswer {
    private Answer answers;
    private double probability;


    public Answer getAnswers() {
        return answers;
    }

    public HelpAnswer(Answer answers, double probability) {
        this.answers = answers;
        this.probability = probability;
    }

    public void setAnswers(Answer answers) {
        this.answers = answers;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    public static int getRandomIndex(Question question, Random random) {
        return random.nextInt(question.getWrongAnswers().size() - 1);
    }

}
