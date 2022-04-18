package help;

import questionAnswer.Answer;
import questionAnswer.Question;

import java.util.Random;

public class FiftyFiftyHelp extends HelpOption{

    Random random = new Random();

HelpAnswer correctAnswer = new HelpAnswer(new Answer("", true, Answer.AnswerSequence.A) ,50.0);


    @Override
    HelpAnswer[] getHelpAnswers(Question question) {
        return new HelpAnswer[2];
    }
}
