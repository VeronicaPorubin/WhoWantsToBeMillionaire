import help.AudienceHelp;
import help.HelpAnswer;
import main.WhileDevopsGame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import questionAnswer.Answer;
import questionAnswer.Question;
import Exception.InvalidLevelException;
import Exception.InvalidScoreException;

import java.util.List;
import java.util.Random;

public class AudienceHelpTest {
    @Test
    void AudienceHelpTest() throws InvalidLevelException, InvalidScoreException, NullPointerException {
        Random rand = new Random();
        int range = rand.nextInt(2);

        WhileDevopsGame game = new WhileDevopsGame();
        Question question = game.getQuestionByLevel(range);


        AudienceHelp audienceHelp = new AudienceHelp();
        List<HelpAnswer> answers = audienceHelp.getHelpAnswers(question);

        Assertions.assertTrue(answers.get(0).getAnswers().isCorrect());
        Assertions.assertFalse(answers.get(1).getAnswers().isCorrect());
        Assertions.assertFalse(answers.get(2).getAnswers().isCorrect());
        Assertions.assertFalse(answers.get(3).getAnswers().isCorrect());
    }

}
