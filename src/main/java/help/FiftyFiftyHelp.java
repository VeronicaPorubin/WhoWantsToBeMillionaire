package help;

import questionAnswer.Answer;
import questionAnswer.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FiftyFiftyHelp extends HelpOption {

    Random random = new Random();

    @Override
    public void showAnswer(List<HelpAnswer> helpAnswer) {
        helpAnswer.forEach(helpAns -> {System.out.println(helpAns.getAnswers().getOption() + ": " +
                helpAns.getAnswers().getAnswer() + "-------->" + helpAns.getProbability() + "%"); });
    }

    @Override
    public List<HelpAnswer> getHelpAnswers(Question question) {
        List<HelpAnswer> helpAnswers = new ArrayList<>();
        helpAnswers.add(new HelpAnswer(question.getCorrectAnswer(), 50.0));
        helpAnswers.add(new HelpAnswer(question.getWrongAnswers().get(0), 50.0));
        return helpAnswers;
    }

    public List<Integer> randomWrongAnswer() {
        Question question = null;
        List<Integer> wrongAnswer = new ArrayList<>();
        for (int i = 0; i < question.getWrongAnswers().size(); i++) {
            wrongAnswer.add(i, random.nextInt(2));
        }
        return wrongAnswer;
    }


}
