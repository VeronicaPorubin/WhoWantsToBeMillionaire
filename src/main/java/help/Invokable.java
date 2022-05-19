package help;

import questionAnswer.Question;

import java.util.List;

public interface Invokable {
    public abstract List<HelpAnswer> getHelpAnswers(Question question) throws NullPointerException;

    public abstract void showAnswer(List<HelpAnswer> helpAnswer);
}
