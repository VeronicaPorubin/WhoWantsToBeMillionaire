package help;

import questionAnswer.Question;

import java.util.Random;

public class FiftyFiftyHelp extends HelpOption {

    Random random = new Random();
    int n = random.nextInt();

    @Override
  public  HelpAnswer[] getHelpAnswers(Question question) {
        HelpAnswer[] helpAnswers = new HelpAnswer[2];
        helpAnswers[0] = new HelpAnswer(question.getCorrectAnswer(), 50.0);
        helpAnswers[1] = new HelpAnswer(question.getWrongAnswers()[n], 50.0);
        return new HelpAnswer[2];
    }

}
