import help.AudienceHelp;
import help.HelpAnswer;
import help.PhoneHelp;
import main.WhileDevopsGame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import questionAnswer.Question;
import Exception.InvalidScoreException;
import Exception.InvalidLevelException;

import java.util.List;
import java.util.Random;

public class PhoneHelpTest {
    @Test
    void AudienceHelpTest() throws InvalidLevelException, InvalidScoreException, NullPointerException {
        Random rand = new Random();
        int range = rand.nextInt(2);

        WhileDevopsGame game = new WhileDevopsGame();
        Question question = game.getQuestionByLevel(range);


        PhoneHelp phoneHelp = new PhoneHelp();
        List<HelpAnswer> answers = phoneHelp.getHelpAnswers(question);

        Assertions.assertNotNull(answers.get(0));
        Assertions.assertTrue(answers.get(0).getAnswers().isCorrect());

    }
}
