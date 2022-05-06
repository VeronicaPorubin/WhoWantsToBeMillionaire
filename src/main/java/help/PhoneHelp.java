package help;

import questionAnswer.Question;

public class PhoneHelp extends HelpOption {

    @Override
    HelpAnswer[] getHelpAnswers(Question question) {
        HelpAnswer[] helpAnswers = new HelpAnswer[1];
        helpAnswers [0] = new HelpAnswer(question.getCorrectAnswer(), 99.9);
        return new HelpAnswer[1];
    }
}
