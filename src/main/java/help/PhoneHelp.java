package help;

import questionAnswer.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneHelp extends HelpOption {


    @Override
  public List<HelpAnswer> getHelpAnswers(Question question) {
        List<HelpAnswer> helpAnswers = new ArrayList<>();
        helpAnswers.add(new HelpAnswer(question.getCorrectAnswer(), 99.9));
        System.out.println(helpAnswers);
        return helpAnswers;
    }
@Override
public void showAnswer(List<HelpAnswer> helpAnswer) {
    helpAnswer.forEach(helpAns -> {System.out.println(helpAns.getAnswers().getOption() + ": " +
            helpAns.getAnswers().getAnswer() + "-------->" + helpAns.getProbability() + "%"); });
}

}
