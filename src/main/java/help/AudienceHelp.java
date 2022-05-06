package help;


import questionAnswer.Question;

public class AudienceHelp extends HelpOption {

    @Override
    HelpAnswer[] getHelpAnswers(Question question) {
        HelpAnswer[] helpAnswers = new HelpAnswer[4];
        helpAnswers [0] = new HelpAnswer(question.getCorrectAnswer(), 42.2);
        helpAnswers [1] = new HelpAnswer(question.getWrongAnswers()[0], 10.5);
        helpAnswers [2] = new HelpAnswer(question.getWrongAnswers()[1], 38.3);
        helpAnswers [3] = new HelpAnswer(question.getWrongAnswers()[2], 9.0);
        return new HelpAnswer[4];
    }
}
