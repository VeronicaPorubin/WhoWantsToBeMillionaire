package help;

import questionAnswer.Question;

public class PhoneHelp extends HelpOption {
    @Override
  public  HelpAnswer[] getHelpAnswers(Question question) {
        HelpAnswer[] helpAnswers = new HelpAnswer[1];
        helpAnswers [0] = new HelpAnswer(question.getCorrectAnswer(), 99.9);
     //   System.out.println(helpAnswers [0]);
        return new HelpAnswer[1];
    }


}
